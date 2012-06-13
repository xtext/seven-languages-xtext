package org.xtext.mongobeans.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.mongobeans.services.MongoBeansGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMongoBeansParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'package'", "'{'", "'}'", "'*'", "'('", "','", "')'", "'.*'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
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


        public InternalMongoBeansParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMongoBeansParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMongoBeansParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g"; }



     	private MongoBeansGrammarAccess grammarAccess;
     	
        public InternalMongoBeansParser(TokenStream input, MongoBeansGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MongoFile";	
       	}
       	
       	@Override
       	protected MongoBeansGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMongoFile"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:67:1: entryRuleMongoFile returns [EObject current=null] : iv_ruleMongoFile= ruleMongoFile EOF ;
    public final EObject entryRuleMongoFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMongoFile = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:68:2: (iv_ruleMongoFile= ruleMongoFile EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:69:2: iv_ruleMongoFile= ruleMongoFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMongoFileRule()); 
            }
            pushFollow(FOLLOW_ruleMongoFile_in_entryRuleMongoFile75);
            iv_ruleMongoFile=ruleMongoFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMongoFile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMongoFile85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMongoFile"


    // $ANTLR start "ruleMongoFile"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:76:1: ruleMongoFile returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleMongoFile() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:79:28: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=13 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:82:3: lv_elements_0_0= ruleAbstractElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMongoFileAccess().getElementsAbstractElementParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleMongoFile130);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMongoFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_0_0, 
            	              		"AbstractElement");
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

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMongoFile"


    // $ANTLR start "entryRuleImport"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:106:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:107:2: (iv_ruleImport= ruleImport EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:108:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport166);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport176); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:115:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:118:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:119:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:119:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:119:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImport213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:123:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:124:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:124:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:125:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport234);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildcard");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:149:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:150:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:151:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractElementRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement270);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement280); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:158:1: ruleAbstractElement returns [EObject current=null] : (this_Import_0= ruleImport | this_PackageDeclaration_1= rulePackageDeclaration | this_MongoBean_2= ruleMongoBean ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Import_0 = null;

        EObject this_PackageDeclaration_1 = null;

        EObject this_MongoBean_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:161:28: ( (this_Import_0= ruleImport | this_PackageDeclaration_1= rulePackageDeclaration | this_MongoBean_2= ruleMongoBean ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:162:1: (this_Import_0= ruleImport | this_PackageDeclaration_1= rulePackageDeclaration | this_MongoBean_2= ruleMongoBean )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:162:1: (this_Import_0= ruleImport | this_PackageDeclaration_1= rulePackageDeclaration | this_MongoBean_2= ruleMongoBean )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:163:5: this_Import_0= ruleImport
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImport_in_ruleAbstractElement327);
                    this_Import_0=ruleImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Import_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:173:5: this_PackageDeclaration_1= rulePackageDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePackageDeclaration_in_ruleAbstractElement354);
                    this_PackageDeclaration_1=rulePackageDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PackageDeclaration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:183:5: this_MongoBean_2= ruleMongoBean
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractElementAccess().getMongoBeanParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMongoBean_in_ruleAbstractElement381);
                    this_MongoBean_2=ruleMongoBean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MongoBean_2; 
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRulePackageDeclaration"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:199:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:200:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:201:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration416);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration426); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:208:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:211:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:212:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:212:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:212:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulePackageDeclaration463); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:216:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:217:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:217:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:218:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration484);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePackageDeclaration496); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:238:1: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=13 && LA3_0<=14)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:239:1: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:239:1: (lv_elements_3_0= ruleAbstractElement )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:240:3: lv_elements_3_0= ruleAbstractElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractElement_in_rulePackageDeclaration517);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_3_0, 
            	              		"AbstractElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_rulePackageDeclaration530); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleMongoBean"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:268:1: entryRuleMongoBean returns [EObject current=null] : iv_ruleMongoBean= ruleMongoBean EOF ;
    public final EObject entryRuleMongoBean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMongoBean = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:269:2: (iv_ruleMongoBean= ruleMongoBean EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:270:2: iv_ruleMongoBean= ruleMongoBean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMongoBeanRule()); 
            }
            pushFollow(FOLLOW_ruleMongoBean_in_entryRuleMongoBean566);
            iv_ruleMongoBean=ruleMongoBean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMongoBean; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMongoBean576); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMongoBean"


    // $ANTLR start "ruleMongoBean"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:277:1: ruleMongoBean returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '{' ( (lv_features_2_0= ruleAbstractFeature ) )* otherlv_3= '}' ) ;
    public final EObject ruleMongoBean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_features_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:280:28: ( ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '{' ( (lv_features_2_0= ruleAbstractFeature ) )* otherlv_3= '}' ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:281:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '{' ( (lv_features_2_0= ruleAbstractFeature ) )* otherlv_3= '}' )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:281:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '{' ( (lv_features_2_0= ruleAbstractFeature ) )* otherlv_3= '}' )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:281:2: ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '{' ( (lv_features_2_0= ruleAbstractFeature ) )* otherlv_3= '}'
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:281:2: ( (lv_name_0_0= ruleValidID ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:282:1: (lv_name_0_0= ruleValidID )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:282:1: (lv_name_0_0= ruleValidID )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:283:3: lv_name_0_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMongoBeanAccess().getNameValidIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleMongoBean622);
            lv_name_0_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMongoBeanRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleMongoBean634); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMongoBeanAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:303:1: ( (lv_features_2_0= ruleAbstractFeature ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==18||LA4_0==35) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:304:1: (lv_features_2_0= ruleAbstractFeature )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:304:1: (lv_features_2_0= ruleAbstractFeature )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:305:3: lv_features_2_0= ruleAbstractFeature
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMongoBeanAccess().getFeaturesAbstractFeatureParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractFeature_in_ruleMongoBean655);
            	    lv_features_2_0=ruleAbstractFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMongoBeanRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"features",
            	              		lv_features_2_0, 
            	              		"AbstractFeature");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleMongoBean668); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMongoBeanAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMongoBean"


    // $ANTLR start "entryRuleAbstractFeature"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:333:1: entryRuleAbstractFeature returns [EObject current=null] : iv_ruleAbstractFeature= ruleAbstractFeature EOF ;
    public final EObject entryRuleAbstractFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractFeature = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:334:2: (iv_ruleAbstractFeature= ruleAbstractFeature EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:335:2: iv_ruleAbstractFeature= ruleAbstractFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractFeature_in_entryRuleAbstractFeature704);
            iv_ruleAbstractFeature=ruleAbstractFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractFeature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractFeature714); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractFeature"


    // $ANTLR start "ruleAbstractFeature"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:342:1: ruleAbstractFeature returns [EObject current=null] : ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) '(' ) )=>this_MongoOperation_0= ruleMongoOperation ) | this_MongoProperty_1= ruleMongoProperty ) ;
    public final EObject ruleAbstractFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MongoOperation_0 = null;

        EObject this_MongoProperty_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:345:28: ( ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) '(' ) )=>this_MongoOperation_0= ruleMongoOperation ) | this_MongoProperty_1= ruleMongoProperty ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:346:1: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) '(' ) )=>this_MongoOperation_0= ruleMongoOperation ) | this_MongoProperty_1= ruleMongoProperty )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:346:1: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) '(' ) )=>this_MongoOperation_0= ruleMongoOperation ) | this_MongoProperty_1= ruleMongoProperty )
            int alt5=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA5_1 = input.LA(2);

                if ( (synpred1_InternalMongoBeans()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
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
            case 18:
                {
                int LA5_2 = input.LA(2);

                if ( (synpred1_InternalMongoBeans()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                int LA5_3 = input.LA(2);

                if ( (synpred1_InternalMongoBeans()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
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
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:346:2: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) '(' ) )=>this_MongoOperation_0= ruleMongoOperation )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:346:2: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) '(' ) )=>this_MongoOperation_0= ruleMongoOperation )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:346:3: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) '(' ) )=>this_MongoOperation_0= ruleMongoOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractFeatureAccess().getMongoOperationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMongoOperation_in_ruleAbstractFeature789);
                    this_MongoOperation_0=ruleMongoOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MongoOperation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:366:5: this_MongoProperty_1= ruleMongoProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractFeatureAccess().getMongoPropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMongoProperty_in_ruleAbstractFeature817);
                    this_MongoProperty_1=ruleMongoProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MongoProperty_1; 
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
    // $ANTLR end "ruleAbstractFeature"


    // $ANTLR start "entryRuleMongoProperty"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:382:1: entryRuleMongoProperty returns [EObject current=null] : iv_ruleMongoProperty= ruleMongoProperty EOF ;
    public final EObject entryRuleMongoProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMongoProperty = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:383:2: (iv_ruleMongoProperty= ruleMongoProperty EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:384:2: iv_ruleMongoProperty= ruleMongoProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMongoPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleMongoProperty_in_entryRuleMongoProperty852);
            iv_ruleMongoProperty=ruleMongoProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMongoProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMongoProperty862); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMongoProperty"


    // $ANTLR start "ruleMongoProperty"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:391:1: ruleMongoProperty returns [EObject current=null] : ( ( ( (lv_type_0_0= ruleJvmTypeReference ) ) | ( (lv_inlineType_1_0= ruleMongoBean ) ) ) ( (lv_many_2_0= '*' ) )? ( (lv_name_3_0= ruleValidID ) ) ) ;
    public final EObject ruleMongoProperty() throws RecognitionException {
        EObject current = null;

        Token lv_many_2_0=null;
        EObject lv_type_0_0 = null;

        EObject lv_inlineType_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:394:28: ( ( ( ( (lv_type_0_0= ruleJvmTypeReference ) ) | ( (lv_inlineType_1_0= ruleMongoBean ) ) ) ( (lv_many_2_0= '*' ) )? ( (lv_name_3_0= ruleValidID ) ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:395:1: ( ( ( (lv_type_0_0= ruleJvmTypeReference ) ) | ( (lv_inlineType_1_0= ruleMongoBean ) ) ) ( (lv_many_2_0= '*' ) )? ( (lv_name_3_0= ruleValidID ) ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:395:1: ( ( ( (lv_type_0_0= ruleJvmTypeReference ) ) | ( (lv_inlineType_1_0= ruleMongoBean ) ) ) ( (lv_many_2_0= '*' ) )? ( (lv_name_3_0= ruleValidID ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:395:2: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) | ( (lv_inlineType_1_0= ruleMongoBean ) ) ) ( (lv_many_2_0= '*' ) )? ( (lv_name_3_0= ruleValidID ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:395:2: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) | ( (lv_inlineType_1_0= ruleMongoBean ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID||LA6_1==17||LA6_1==32||LA6_1==46||LA6_1==49) ) {
                    alt6=1;
                }
                else if ( (LA6_1==15) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==18||LA6_0==35) ) {
                alt6=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:395:3: ( (lv_type_0_0= ruleJvmTypeReference ) )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:395:3: ( (lv_type_0_0= ruleJvmTypeReference ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:396:1: (lv_type_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:396:1: (lv_type_0_0= ruleJvmTypeReference )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:397:3: lv_type_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMongoPropertyAccess().getTypeJvmTypeReferenceParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleMongoProperty909);
                    lv_type_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMongoPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:414:6: ( (lv_inlineType_1_0= ruleMongoBean ) )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:414:6: ( (lv_inlineType_1_0= ruleMongoBean ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:415:1: (lv_inlineType_1_0= ruleMongoBean )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:415:1: (lv_inlineType_1_0= ruleMongoBean )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:416:3: lv_inlineType_1_0= ruleMongoBean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMongoPropertyAccess().getInlineTypeMongoBeanParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMongoBean_in_ruleMongoProperty936);
                    lv_inlineType_1_0=ruleMongoBean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMongoPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"inlineType",
                              		lv_inlineType_1_0, 
                              		"MongoBean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:432:3: ( (lv_many_2_0= '*' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:433:1: (lv_many_2_0= '*' )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:433:1: (lv_many_2_0= '*' )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:434:3: lv_many_2_0= '*'
                    {
                    lv_many_2_0=(Token)match(input,17,FOLLOW_17_in_ruleMongoProperty955); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_many_2_0, grammarAccess.getMongoPropertyAccess().getManyAsteriskKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMongoPropertyRule());
                      	        }
                             		setWithLastConsumed(current, "many", true, "*");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:447:3: ( (lv_name_3_0= ruleValidID ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:448:1: (lv_name_3_0= ruleValidID )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:448:1: (lv_name_3_0= ruleValidID )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:449:3: lv_name_3_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMongoPropertyAccess().getNameValidIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleMongoProperty990);
            lv_name_3_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMongoPropertyRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
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
    // $ANTLR end "ruleMongoProperty"


    // $ANTLR start "entryRuleMongoOperation"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:473:1: entryRuleMongoOperation returns [EObject current=null] : iv_ruleMongoOperation= ruleMongoOperation EOF ;
    public final EObject entryRuleMongoOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMongoOperation = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:474:2: (iv_ruleMongoOperation= ruleMongoOperation EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:475:2: iv_ruleMongoOperation= ruleMongoOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMongoOperationRule()); 
            }
            pushFollow(FOLLOW_ruleMongoOperation_in_entryRuleMongoOperation1026);
            iv_ruleMongoOperation=ruleMongoOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMongoOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMongoOperation1036); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMongoOperation"


    // $ANTLR start "ruleMongoOperation"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:482:1: ruleMongoOperation returns [EObject current=null] : ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) '(' ) )=> ( ( (lv_returnType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' ) ) ( ( (lv_parameters_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleXBlockExpression ) ) ) ;
    public final EObject ruleMongoOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_returnType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_body_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:485:28: ( ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) '(' ) )=> ( ( (lv_returnType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' ) ) ( ( (lv_parameters_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleXBlockExpression ) ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:486:1: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) '(' ) )=> ( ( (lv_returnType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' ) ) ( ( (lv_parameters_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleXBlockExpression ) ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:486:1: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) '(' ) )=> ( ( (lv_returnType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' ) ) ( ( (lv_parameters_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleXBlockExpression ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:486:2: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) '(' ) )=> ( ( (lv_returnType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' ) ) ( ( (lv_parameters_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleXBlockExpression ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:486:2: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) '(' ) )=> ( ( (lv_returnType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:486:3: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) '(' ) )=> ( ( (lv_returnType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:495:5: ( ( (lv_returnType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:495:6: ( (lv_returnType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '('
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:495:6: ( (lv_returnType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:496:1: (lv_returnType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:496:1: (lv_returnType_0_0= ruleJvmTypeReference )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:497:3: lv_returnType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMongoOperationAccess().getReturnTypeJvmTypeReferenceParserRuleCall_0_0_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleMongoOperation1111);
            lv_returnType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMongoOperationRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:513:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:514:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:514:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:515:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMongoOperationAccess().getNameValidIDParserRuleCall_0_0_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleMongoOperation1132);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMongoOperationRule());
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleMongoOperation1144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMongoOperationAccess().getLeftParenthesisKeyword_0_0_2());
                  
            }

            }


            }

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:535:3: ( ( (lv_parameters_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFullJvmFormalParameter ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==18||LA9_0==35) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:535:4: ( (lv_parameters_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFullJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:535:4: ( (lv_parameters_3_0= ruleFullJvmFormalParameter ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:536:1: (lv_parameters_3_0= ruleFullJvmFormalParameter )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:536:1: (lv_parameters_3_0= ruleFullJvmFormalParameter )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:537:3: lv_parameters_3_0= ruleFullJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMongoOperationAccess().getParametersFullJvmFormalParameterParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleMongoOperation1168);
                    lv_parameters_3_0=ruleFullJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMongoOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_3_0, 
                              		"FullJvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:553:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleFullJvmFormalParameter ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==19) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:553:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleFullJvmFormalParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleMongoOperation1181); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getMongoOperationAccess().getCommaKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:557:1: ( (lv_parameters_5_0= ruleFullJvmFormalParameter ) )
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:558:1: (lv_parameters_5_0= ruleFullJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:558:1: (lv_parameters_5_0= ruleFullJvmFormalParameter )
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:559:3: lv_parameters_5_0= ruleFullJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMongoOperationAccess().getParametersFullJvmFormalParameterParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleMongoOperation1202);
                    	    lv_parameters_5_0=ruleFullJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMongoOperationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_5_0, 
                    	              		"FullJvmFormalParameter");
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

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleMongoOperation1218); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMongoOperationAccess().getRightParenthesisKeyword_2());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:579:1: ( (lv_body_7_0= ruleXBlockExpression ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:580:1: (lv_body_7_0= ruleXBlockExpression )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:580:1: (lv_body_7_0= ruleXBlockExpression )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:581:3: lv_body_7_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMongoOperationAccess().getBodyXBlockExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleMongoOperation1239);
            lv_body_7_0=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMongoOperationRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_7_0, 
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
    // $ANTLR end "ruleMongoOperation"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:605:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:606:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:607:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1276);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1287); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:614:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:617:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:618:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:618:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:619:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard1334);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:629:1: (kw= '.*' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:630:2: kw= '.*'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleQualifiedNameWithWildcard1353); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                          
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleXExpression"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:643:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:644:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:645:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1395);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1405); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:652:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:655:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:657:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1451);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:673:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:674:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:675:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1485);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1495); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:682:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:685:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:686:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:686:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||(LA12_1>=RULE_STRING && LA12_1<=RULE_ID)||(LA12_1>=15 && LA12_1<=20)||(LA12_1>=23 && LA12_1<=49)||(LA12_1>=51 && LA12_1<=75)) ) {
                    alt12=2;
                }
                else if ( (LA12_1==22) ) {
                    alt12=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_DECIMAL)||LA12_0==15||LA12_0==18||LA12_0==32||(LA12_0>=39 && LA12_0<=40)||LA12_0==44||LA12_0==49||LA12_0==53||LA12_0==55||(LA12_0>=59 && LA12_0<=61)||LA12_0==64||(LA12_0>=66 && LA12_0<=73)) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:686:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:686:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:686:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:686:3: ()
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:687:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:692:2: ( ( ruleValidID ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:693:1: ( ruleValidID )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:693:1: ( ruleValidID )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:694:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1553);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1569);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:715:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:716:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:716:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:717:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1589);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:734:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:734:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:735:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1619);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:743:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==23) ) {
                        int LA11_1 = input.LA(2);

                        if ( (synpred3_InternalMongoBeans()) ) {
                            alt11=1;
                        }
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:743:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:743:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:743:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:748:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:748:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:748:7: ()
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:749:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:754:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:755:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:755:1: ( ruleOpMultiAssign )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:756:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1672);
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

                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:769:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:770:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:770:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:771:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1695);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:795:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:796:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:797:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1735);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1746); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:804:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:807:28: (kw= '=' )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:809:2: kw= '='
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleOpSingleAssign1783); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:822:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:823:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:824:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1823);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1834); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:831:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:834:28: (kw= '+=' )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:836:2: kw= '+='
            {
            kw=(Token)match(input,23,FOLLOW_23_in_ruleOpMultiAssign1871); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:849:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:850:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:851:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1910);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1920); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:858:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:861:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:862:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:862:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:863:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1967);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:871:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred4_InternalMongoBeans()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:871:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:871:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:871:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:876:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:876:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:876:7: ()
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:877:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:882:2: ( ( ruleOpOr ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:883:1: ( ruleOpOr )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:883:1: ( ruleOpOr )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:884:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression2020);
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

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:897:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:898:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:898:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:899:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2043);
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:923:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:924:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:925:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2082);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2093); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:932:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:935:28: (kw= '||' )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:937:2: kw= '||'
            {
            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOr2130); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:950:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:951:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:952:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2169);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2179); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:959:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:962:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:963:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:963:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:964:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2226);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:972:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred5_InternalMongoBeans()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:972:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:972:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:972:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:977:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:977:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:977:7: ()
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:978:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:983:2: ( ( ruleOpAnd ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:984:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:984:1: ( ruleOpAnd )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:985:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2279);
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

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:998:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:999:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:999:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1000:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2302);
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1024:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1025:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1026:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2341);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2352); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1033:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1036:28: (kw= '&&' )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1038:2: kw= '&&'
            {
            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpAnd2389); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1051:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1052:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1053:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2428);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2438); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1060:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1063:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1064:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1064:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1065:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2485);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1073:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred6_InternalMongoBeans()) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==27) ) {
                    int LA15_3 = input.LA(2);

                    if ( (synpred6_InternalMongoBeans()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1073:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1073:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1073:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1078:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1078:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1078:7: ()
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1079:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1084:2: ( ( ruleOpEquality ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1085:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1085:1: ( ruleOpEquality )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1086:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2538);
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

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1099:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1100:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1100:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1101:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2561);
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1125:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1126:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1127:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2600);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2611); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1134:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1137:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1138:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1138:1: (kw= '==' | kw= '!=' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            else if ( (LA16_0==27) ) {
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1139:2: kw= '=='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpEquality2649); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1146:2: kw= '!='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpEquality2668); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1159:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1160:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1161:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2708);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2718); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1168:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1171:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1172:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1172:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1173:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2765);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1181:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop17:
            do {
                int alt17=3;
                switch ( input.LA(1) ) {
                case 31:
                    {
                    int LA17_2 = input.LA(2);

                    if ( (synpred8_InternalMongoBeans()) ) {
                        alt17=2;
                    }


                    }
                    break;
                case 32:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (synpred8_InternalMongoBeans()) ) {
                        alt17=2;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA17_4 = input.LA(2);

                    if ( (synpred7_InternalMongoBeans()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA17_5 = input.LA(2);

                    if ( (synpred8_InternalMongoBeans()) ) {
                        alt17=2;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA17_6 = input.LA(2);

                    if ( (synpred8_InternalMongoBeans()) ) {
                        alt17=2;
                    }


                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1181:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1181:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1181:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1181:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1181:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1183:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1183:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1183:6: ()
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1184:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleXRelationalExpression2801); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1193:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1194:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1194:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1195:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2824);
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
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1212:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1212:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1212:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1212:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1212:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1217:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1217:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1217:7: ()
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1218:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1223:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1224:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1224:1: ( ruleOpCompare )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1225:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2885);
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

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1238:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1239:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1239:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1240:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2908);
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1264:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1265:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1266:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2948);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2959); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1273:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1276:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1277:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1277:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt18=1;
                }
                break;
            case 30:
                {
                alt18=2;
                }
                break;
            case 31:
                {
                alt18=3;
                }
                break;
            case 32:
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1278:2: kw= '>='
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpCompare2997); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1285:2: kw= '<='
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpCompare3016); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1292:2: kw= '>'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpCompare3035); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1299:2: kw= '<'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpCompare3054); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1312:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1313:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1314:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3094);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3104); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1321:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1324:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1325:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1325:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1326:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3151);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1334:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1334:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1334:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1334:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1339:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1339:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1339:7: ()
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1340:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1345:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1346:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1346:1: ( ruleOpOther )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1347:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3204);
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

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1360:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1361:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1361:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1362:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3227);
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1386:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1387:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1388:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3266);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3277); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1395:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1398:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1399:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1399:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt22=8;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt22=1;
                }
                break;
            case 34:
                {
                alt22=2;
                }
                break;
            case 35:
                {
                alt22=3;
                }
                break;
            case 31:
                {
                alt22=4;
                }
                break;
            case 32:
                {
                alt22=5;
                }
                break;
            case 36:
                {
                alt22=6;
                }
                break;
            case 37:
                {
                alt22=7;
                }
                break;
            case 38:
                {
                alt22=8;
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1400:2: kw= '->'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther3315); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1407:2: kw= '..'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpOther3334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1414:2: kw= '=>'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther3353); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1420:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1420:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1421:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther3373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1426:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==31) ) {
                        int LA20_1 = input.LA(2);

                        if ( (LA20_1==31) && (synpred10_InternalMongoBeans())) {
                            alt20=1;
                        }
                        else if ( (LA20_1==EOF||(LA20_1>=RULE_STRING && LA20_1<=RULE_ID)||LA20_1==15||LA20_1==18||LA20_1==32||(LA20_1>=39 && LA20_1<=40)||LA20_1==44||LA20_1==49||LA20_1==53||LA20_1==55||(LA20_1>=59 && LA20_1<=61)||LA20_1==64||(LA20_1>=66 && LA20_1<=73)) ) {
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
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1426:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1426:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1426:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1430:5: (kw= '>' kw= '>' )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1431:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther3404); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther3417); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1444:2: kw= '>'
                            {
                            kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther3438); if (state.failed) return current;
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1450:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1450:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1451:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther3460); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1456:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==32) ) {
                        int LA21_1 = input.LA(2);

                        if ( (synpred11_InternalMongoBeans()) ) {
                            alt21=1;
                        }
                        else if ( (true) ) {
                            alt21=2;
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
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1456:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1456:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1456:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1460:5: (kw= '<' kw= '<' )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1461:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther3491); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther3504); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1474:2: kw= '<'
                            {
                            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther3525); if (state.failed) return current;
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1481:2: kw= '<>'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther3546); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1488:2: kw= '?:'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpOther3565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1495:2: kw= '<=>'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpOther3584); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1508:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1509:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1510:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3624);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3634); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1517:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1520:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1521:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1521:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1522:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3681);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1530:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==39) ) {
                    int LA23_2 = input.LA(2);

                    if ( (synpred12_InternalMongoBeans()) ) {
                        alt23=1;
                    }


                }
                else if ( (LA23_0==40) ) {
                    int LA23_3 = input.LA(2);

                    if ( (synpred12_InternalMongoBeans()) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1530:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1530:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1530:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1535:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1535:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1535:7: ()
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1536:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1541:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1542:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1542:1: ( ruleOpAdd )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1543:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3734);
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

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1556:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1557:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1557:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1558:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3757);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1582:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1583:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1584:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3796);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3807); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1591:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1594:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1595:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1595:1: (kw= '+' | kw= '-' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            else if ( (LA24_0==40) ) {
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1596:2: kw= '+'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpAdd3845); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1603:2: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpAdd3864); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1616:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1617:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1618:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3904);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3914); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1625:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1628:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1629:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1629:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1630:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3961);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1638:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop25:
            do {
                int alt25=2;
                switch ( input.LA(1) ) {
                case 17:
                    {
                    int LA25_2 = input.LA(2);

                    if ( (synpred13_InternalMongoBeans()) ) {
                        alt25=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA25_3 = input.LA(2);

                    if ( (synpred13_InternalMongoBeans()) ) {
                        alt25=1;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA25_4 = input.LA(2);

                    if ( (synpred13_InternalMongoBeans()) ) {
                        alt25=1;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA25_5 = input.LA(2);

                    if ( (synpred13_InternalMongoBeans()) ) {
                        alt25=1;
                    }


                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1638:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1638:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1638:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1643:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1643:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1643:7: ()
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1644:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1649:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1650:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1650:1: ( ruleOpMulti )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1651:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4014);
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

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1664:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1665:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1665:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1666:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4037);
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1690:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1691:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1692:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti4076);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti4087); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1699:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1702:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1703:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1703:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt26=1;
                }
                break;
            case 41:
                {
                alt26=2;
                }
                break;
            case 42:
                {
                alt26=3;
                }
                break;
            case 43:
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1704:2: kw= '*'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleOpMulti4125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1711:2: kw= '**'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpMulti4144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1718:2: kw= '/'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpMulti4163); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1725:2: kw= '%'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpMulti4182); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1738:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1739:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1740:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4222);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation4232); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1747:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1750:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1751:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1751:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=39 && LA27_0<=40)||LA27_0==44) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)||LA27_0==15||LA27_0==18||LA27_0==32||LA27_0==49||LA27_0==53||LA27_0==55||(LA27_0>=59 && LA27_0<=61)||LA27_0==64||(LA27_0>=66 && LA27_0<=73)) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1751:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1751:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1751:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1751:3: ()
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1752:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1757:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1758:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1758:1: ( ruleOpUnary )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1759:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4290);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1772:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1773:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1773:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1774:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4311);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1792:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4340);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1808:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1809:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1810:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4376);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4387); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1817:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1820:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1821:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1821:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt28=1;
                }
                break;
            case 40:
                {
                alt28=2;
                }
                break;
            case 39:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1822:2: kw= '!'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpUnary4425); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1829:2: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpUnary4444); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1836:2: kw= '+'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpUnary4463); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1849:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1850:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1851:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4503);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4513); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1858:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1861:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1862:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1862:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1863:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4560);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1871:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==45) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred14_InternalMongoBeans()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1871:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1871:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1871:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1873:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1873:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1873:6: ()
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1874:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXCastedExpression4595); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1883:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1884:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1884:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1885:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4618);
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1909:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1910:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1911:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4656);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4666); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1918:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1921:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1922:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1922:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1923:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4713);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1931:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop37:
            do {
                int alt37=3;
                switch ( input.LA(1) ) {
                case 46:
                    {
                    int LA37_2 = input.LA(2);

                    if ( (synpred15_InternalMongoBeans()) ) {
                        alt37=1;
                    }
                    else if ( (synpred16_InternalMongoBeans()) ) {
                        alt37=2;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA37_3 = input.LA(2);

                    if ( (synpred16_InternalMongoBeans()) ) {
                        alt37=2;
                    }


                    }
                    break;
                case 48:
                    {
                    int LA37_4 = input.LA(2);

                    if ( (synpred16_InternalMongoBeans()) ) {
                        alt37=2;
                    }


                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1931:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1931:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1931:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1931:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1931:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1937:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1937:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1937:26: ()
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1938:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall4762); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1947:1: ( ( ruleValidID ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1948:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1948:1: ( ruleValidID )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1949:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4785);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4801);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1970:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1971:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1971:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1972:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4823);
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
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1989:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1989:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1989:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1989:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1989:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2005:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2005:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2005:8: ()
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2006:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2011:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt30=3;
            	    switch ( input.LA(1) ) {
            	    case 46:
            	        {
            	        alt30=1;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt30=2;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt30=3;
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
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2011:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall4909); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2016:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2016:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2017:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2017:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2018:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall4933); if (state.failed) return current;
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
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2032:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2032:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2033:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2033:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2034:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall4970); if (state.failed) return current;
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

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2047:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==32) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2047:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleXMemberFeatureCall4999); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2051:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2052:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2052:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2053:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5020);
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

            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2069:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop31:
            	            do {
            	                int alt31=2;
            	                int LA31_0 = input.LA(1);

            	                if ( (LA31_0==19) ) {
            	                    alt31=1;
            	                }


            	                switch (alt31) {
            	            	case 1 :
            	            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2069:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleXMemberFeatureCall5033); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2073:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2074:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2074:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2075:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5054);
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
            	            	    break loop31;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,31,FOLLOW_31_in_ruleXMemberFeatureCall5068); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2095:3: ( ( ruleValidID ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2096:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2096:1: ( ruleValidID )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2097:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5093);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2110:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt35=2;
            	    alt35 = dfa35.predict(input);
            	    switch (alt35) {
            	        case 1 :
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2110:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2110:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2110:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2117:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2118:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,18,FOLLOW_18_in_ruleXMemberFeatureCall5127); if (state.failed) return current;
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

            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2131:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt34=3;
            	            alt34 = dfa34.predict(input);
            	            switch (alt34) {
            	                case 1 :
            	                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2131:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2131:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2131:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2148:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2149:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5212);
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
            	                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2166:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2166:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2166:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2166:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2167:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2167:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2168:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5240);
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

            	                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2184:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop33:
            	                    do {
            	                        int alt33=2;
            	                        int LA33_0 = input.LA(1);

            	                        if ( (LA33_0==19) ) {
            	                            alt33=1;
            	                        }


            	                        switch (alt33) {
            	                    	case 1 :
            	                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2184:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleXMemberFeatureCall5253); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2188:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2189:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2189:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2190:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5274);
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
            	                    	    break loop33;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,20,FOLLOW_20_in_ruleXMemberFeatureCall5291); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2210:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt36=2;
            	    alt36 = dfa36.predict(input);
            	    switch (alt36) {
            	        case 1 :
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2210:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2213:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2214:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5326);
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2238:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2239:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2240:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5366);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression5376); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2247:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2250:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2251:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2251:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt38=13;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2252:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5423);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2262:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5450);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2272:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5477);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2282:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5504);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2292:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5531);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2302:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5558);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2312:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5585);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2322:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5612);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2332:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5639);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2342:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5666);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2352:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5693);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2362:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5720);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2372:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5747);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2388:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2389:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2390:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5782);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5792); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2397:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2400:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2401:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2401:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt39=6;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) && (synpred20_InternalMongoBeans())) {
                alt39=1;
            }
            else if ( ((LA39_0>=67 && LA39_0<=68)) ) {
                alt39=2;
            }
            else if ( ((LA39_0>=RULE_HEX && LA39_0<=RULE_DECIMAL)) ) {
                alt39=3;
            }
            else if ( (LA39_0==69) ) {
                alt39=4;
            }
            else if ( (LA39_0==RULE_STRING) ) {
                alt39=5;
            }
            else if ( (LA39_0==70) ) {
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2401:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2401:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2401:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5852);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2414:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5880);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2424:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5907);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2434:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5934);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2444:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5961);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2454:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5988);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2470:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2471:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2472:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure6023);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure6033); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2479:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2482:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2483:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2483:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2483:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2483:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2483:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2485:5: ( () otherlv_1= '[' )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2485:6: () otherlv_1= '['
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2485:6: ()
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2486:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXClosure6093); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2495:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2495:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2510:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2510:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2510:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ID||LA41_0==18||LA41_0==35) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2510:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2510:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2511:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2511:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2512:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6166);
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

                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2528:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==19) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2528:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleXClosure6179); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2532:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2533:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2533:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2534:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6200);
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

                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2550:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2551:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2551:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2552:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,50,FOLLOW_50_in_ruleXClosure6222); if (state.failed) return current;
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

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2565:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2566:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2566:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2567:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6259);
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

            otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleXClosure6271); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2595:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2596:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2597:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6307);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure6317); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2604:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2607:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2608:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2608:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2608:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2608:2: ()
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2609:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2614:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_STRING && LA44_0<=RULE_ID)||LA44_0==15||LA44_0==18||LA44_0==32||(LA44_0>=39 && LA44_0<=40)||LA44_0==44||LA44_0==49||LA44_0==53||LA44_0==55||(LA44_0>=59 && LA44_0<=64)||(LA44_0>=66 && LA44_0<=73)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2614:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2614:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2615:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2615:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2616:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6373);
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

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2632:2: (otherlv_2= ';' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==52) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2632:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleXExpressionInClosure6386); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2644:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2645:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2646:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6426);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6436); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2653:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2656:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2657:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2657:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2657:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2657:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2657:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2673:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2673:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2673:7: ()
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2674:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2679:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==18||LA46_0==35) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2679:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2679:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2680:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2680:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2681:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6544);
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

                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2697:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==19) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2697:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXShortClosure6557); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2701:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2702:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2702:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2703:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6578);
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

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2719:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2720:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2720:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2721:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,50,FOLLOW_50_in_ruleXShortClosure6600); if (state.failed) return current;
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

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2734:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2735:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2735:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2736:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6636);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2760:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2761:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2762:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6672);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6682); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2769:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2772:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2773:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2773:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2773:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleXParenthesizedExpression6719); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6741);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleXParenthesizedExpression6752); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2798:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2799:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2800:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6788);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6798); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2807:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2810:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2811:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2811:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2811:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2811:2: ()
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2812:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXIfExpression6844); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleXIfExpression6856); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2825:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2826:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2826:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2827:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6877);
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

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleXIfExpression6889); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2847:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2848:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2848:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2849:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6910);
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

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2865:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==54) ) {
                int LA47_1 = input.LA(2);

                if ( (synpred24_InternalMongoBeans()) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2865:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2865:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2865:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,54,FOLLOW_54_in_ruleXIfExpression6931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2870:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2871:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2871:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2872:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6953);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2896:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2897:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2898:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6991);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression7001); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2905:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2908:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2909:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2909:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2909:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2909:2: ()
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2910:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression7047); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2919:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_ID)||LA49_0==15||LA49_0==32||(LA49_0>=39 && LA49_0<=40)||LA49_0==44||LA49_0==49||LA49_0==53||LA49_0==55||(LA49_0>=59 && LA49_0<=61)||LA49_0==64||(LA49_0>=66 && LA49_0<=73)) ) {
                alt49=1;
            }
            else if ( (LA49_0==18) ) {
                int LA49_2 = input.LA(2);

                if ( (LA49_2==RULE_ID) ) {
                    int LA49_3 = input.LA(3);

                    if ( ((LA49_3>=17 && LA49_3<=18)||LA49_3==20||(LA49_3>=22 && LA49_3<=43)||(LA49_3>=45 && LA49_3<=49)||LA49_3==65) ) {
                        alt49=1;
                    }
                    else if ( (LA49_3==56) && (synpred26_InternalMongoBeans())) {
                        alt49=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA49_2>=RULE_STRING && LA49_2<=RULE_DECIMAL)||LA49_2==15||LA49_2==18||LA49_2==32||(LA49_2>=39 && LA49_2<=40)||LA49_2==44||LA49_2==49||LA49_2==53||LA49_2==55||(LA49_2>=59 && LA49_2<=61)||LA49_2==64||(LA49_2>=66 && LA49_2<=73)) ) {
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2919:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2919:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2919:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2919:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_ID) ) {
                        int LA48_1 = input.LA(2);

                        if ( (LA48_1==56) && (synpred25_InternalMongoBeans())) {
                            alt48=1;
                        }
                    }
                    switch (alt48) {
                        case 1 :
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2919:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2924:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2924:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2924:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2925:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2925:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2926:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7090);
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

                            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression7102); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2946:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2947:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2947:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2948:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7126);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2965:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2965:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2965:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2965:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2965:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2971:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2971:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleXSwitchExpression7170); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2975:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2976:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2976:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2977:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7191);
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

                    otherlv_7=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression7203); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2997:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2998:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2998:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2999:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7226);
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

                    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleXSwitchExpression7238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleXSwitchExpression7252); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3023:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID||LA50_0==18||LA50_0==35||LA50_0==56||LA50_0==58) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3024:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3024:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3025:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7273);
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

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3041:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==57) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3041:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression7287); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression7299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3049:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3050:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3050:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3051:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7320);
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

            otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleXSwitchExpression7334); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3079:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3080:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3081:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7370);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7380); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3088:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3091:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3092:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3092:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3092:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3092:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID||LA52_0==18||LA52_0==35) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3093:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3093:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3094:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7426);
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

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3110:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==58) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3110:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXCasePart7440); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3114:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3115:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3115:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3116:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7461);
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

            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleXCasePart7475); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3136:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3137:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3137:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3138:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7496);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3162:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3163:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3164:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7532);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7542); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3171:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3174:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3175:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3175:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3175:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3175:2: ()
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3176:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXForLoopExpression7588); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleXForLoopExpression7600); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3189:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3190:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3190:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3191:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7621);
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

            otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleXForLoopExpression7633); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3211:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3212:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3212:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3213:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7654);
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

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleXForLoopExpression7666); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3233:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3234:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3234:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3235:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7687);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3259:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3260:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3261:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7723);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7733); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3268:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3271:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3272:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3272:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3272:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3272:2: ()
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3273:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXWhileExpression7779); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleXWhileExpression7791); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3286:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3287:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3287:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3288:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7812);
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

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleXWhileExpression7824); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3308:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3309:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3309:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3310:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7845);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3334:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3335:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3336:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7881);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7891); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3343:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3346:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3347:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3347:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3347:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3347:2: ()
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3348:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXDoWhileExpression7937); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3357:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3358:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3358:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3359:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7958);
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

            otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleXDoWhileExpression7970); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleXDoWhileExpression7982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3383:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3384:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3384:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3385:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8003);
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

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleXDoWhileExpression8015); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3413:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3414:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3415:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8051);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression8061); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3422:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3425:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3426:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3426:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3426:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3426:2: ()
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3427:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleXBlockExpression8107); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3436:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=RULE_STRING && LA55_0<=RULE_ID)||LA55_0==15||LA55_0==18||LA55_0==32||(LA55_0>=39 && LA55_0<=40)||LA55_0==44||LA55_0==49||LA55_0==53||LA55_0==55||(LA55_0>=59 && LA55_0<=64)||(LA55_0>=66 && LA55_0<=73)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3436:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3436:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3437:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3437:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3438:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8129);
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

            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3454:2: (otherlv_3= ';' )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==52) ) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3454:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleXBlockExpression8142); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleXBlockExpression8158); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3470:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3471:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3472:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8194);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8204); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3479:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3482:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3483:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3483:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=62 && LA56_0<=63)) ) {
                alt56=1;
            }
            else if ( ((LA56_0>=RULE_STRING && LA56_0<=RULE_ID)||LA56_0==15||LA56_0==18||LA56_0==32||(LA56_0>=39 && LA56_0<=40)||LA56_0==44||LA56_0==49||LA56_0==53||LA56_0==55||(LA56_0>=59 && LA56_0<=61)||LA56_0==64||(LA56_0>=66 && LA56_0<=73)) ) {
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3484:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8251);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3494:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8278);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3510:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3511:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3512:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8313);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8323); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3519:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3522:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3523:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3523:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3523:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3523:2: ()
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3524:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3529:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==62) ) {
                alt57=1;
            }
            else if ( (LA57_0==63) ) {
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3529:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3529:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3530:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3530:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3531:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,62,FOLLOW_62_in_ruleXVariableDeclaration8376); if (state.failed) return current;
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3545:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleXVariableDeclaration8407); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3549:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                int LA58_1 = input.LA(2);

                if ( (synpred27_InternalMongoBeans()) ) {
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
            else if ( (LA58_0==18) && (synpred27_InternalMongoBeans())) {
                alt58=1;
            }
            else if ( (LA58_0==35) && (synpred27_InternalMongoBeans())) {
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3549:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3549:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3549:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3557:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3557:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3557:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3558:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3558:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3559:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8455);
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

                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3575:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3576:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3576:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3577:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8476);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3594:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3594:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3595:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3595:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3596:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8505);
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

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3612:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==22) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3612:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleXVariableDeclaration8519); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3616:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3617:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3617:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3618:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8540);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3642:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3643:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3644:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8578);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8588); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3651:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3654:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3655:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3655:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3655:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3655:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==RULE_ID||LA60_1==32||LA60_1==46||LA60_1==49) ) {
                    alt60=1;
                }
            }
            else if ( (LA60_0==18||LA60_0==35) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3656:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3656:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3657:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8634);
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

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3673:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3674:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3674:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3675:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8656);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3699:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3700:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3701:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8692);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8702); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3708:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3711:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3712:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3712:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3712:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3712:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3713:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3713:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3714:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8748);
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

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3730:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3731:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3731:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3732:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8769);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3756:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3757:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3758:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8805);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8815); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3765:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3768:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3769:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3769:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3769:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3769:2: ()
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3770:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3775:2: ( ( ruleStaticQualifier ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==65) ) {
                    alt61=1;
                }
            }
            switch (alt61) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3776:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3776:1: ( ruleStaticQualifier )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3777:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8872);
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

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3790:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==32) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3790:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleXFeatureCall8886); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3794:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3795:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3795:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3796:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8907);
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

                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3812:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==19) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3812:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleXFeatureCall8920); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3816:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3817:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3817:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3818:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8941);
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

                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleXFeatureCall8955); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3838:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3839:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3839:1: ( ruleIdOrSuper )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3840:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8980);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3853:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3853:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3853:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3853:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3860:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3861:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,18,FOLLOW_18_in_ruleXFeatureCall9014); if (state.failed) return current;
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

                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3874:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt65=3;
                    alt65 = dfa65.predict(input);
                    switch (alt65) {
                        case 1 :
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3874:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3874:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3874:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3891:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3892:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9099);
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
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3909:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3909:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3909:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3909:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3910:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3910:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3911:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9127);
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

                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3927:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop64:
                            do {
                                int alt64=2;
                                int LA64_0 = input.LA(1);

                                if ( (LA64_0==19) ) {
                                    alt64=1;
                                }


                                switch (alt64) {
                            	case 1 :
                            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3927:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleXFeatureCall9140); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3931:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3932:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3932:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3933:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9161);
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

                    otherlv_13=(Token)match(input,20,FOLLOW_20_in_ruleXFeatureCall9178); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3953:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3953:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3956:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3957:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall9213);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3981:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3982:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3983:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9251);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper9262); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3990:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3993:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3994:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3994:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                alt68=1;
            }
            else if ( (LA68_0==64) ) {
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3995:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper9309);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4007:2: kw= 'super'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleIdOrSuper9333); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4020:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4021:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4022:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9374);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier9385); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4029:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4032:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4033:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4033:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt69=0;
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_ID) ) {
                    int LA69_2 = input.LA(2);

                    if ( (LA69_2==65) ) {
                        alt69=1;
                    }


                }


                switch (alt69) {
            	case 1 :
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4034:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier9432);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,65,FOLLOW_65_in_ruleStaticQualifier9450); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4058:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4059:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4060:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9491);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9501); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4067:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4070:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4071:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4071:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4071:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4071:2: ()
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4072:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXConstructorCall9547); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4081:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4082:1: ( ruleQualifiedName )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4082:1: ( ruleQualifiedName )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4083:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9570);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4096:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4096:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4096:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4096:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleXConstructorCall9591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4101:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4102:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4102:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4103:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9613);
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

                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4119:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==19) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4119:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleXConstructorCall9626); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4123:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4124:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4124:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4125:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9647);
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

                    otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleXConstructorCall9661); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4145:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4145:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4145:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4145:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleXConstructorCall9684); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4150:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt73=3;
                    alt73 = dfa73.predict(input);
                    switch (alt73) {
                        case 1 :
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4150:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4150:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4150:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4167:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4168:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9757);
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
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4185:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4185:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4185:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4185:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4186:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4186:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4187:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9785);
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

                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4203:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop72:
                            do {
                                int alt72=2;
                                int LA72_0 = input.LA(1);

                                if ( (LA72_0==19) ) {
                                    alt72=1;
                                }


                                switch (alt72) {
                            	case 1 :
                            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4203:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleXConstructorCall9798); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4207:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4208:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4208:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4209:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9819);
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

                    otherlv_13=(Token)match(input,20,FOLLOW_20_in_ruleXConstructorCall9836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4229:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt75=2;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4229:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4232:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4233:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9871);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4257:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4258:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4259:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9908);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9918); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4266:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4269:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4270:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4270:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4270:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4270:2: ()
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4271:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4276:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==67) ) {
                alt76=1;
            }
            else if ( (LA76_0==68) ) {
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4276:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXBooleanLiteral9965); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4281:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4281:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4282:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4282:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4283:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,68,FOLLOW_68_in_ruleXBooleanLiteral9989); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4304:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4305:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4306:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10039);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral10049); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4313:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4316:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4317:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4317:1: ( () otherlv_1= 'null' )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4317:2: () otherlv_1= 'null'
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4317:2: ()
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4318:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXNullLiteral10095); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4335:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4336:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4337:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral10131);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral10141); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4344:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4347:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4348:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4348:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4348:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4348:2: ()
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4349:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4354:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4355:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4355:1: (lv_value_1_0= ruleNumber )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4356:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral10196);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4380:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4381:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4382:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10232);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral10242); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4389:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4392:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4393:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4393:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4393:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4393:2: ()
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4394:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4399:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4400:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4400:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4401:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral10293); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4425:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4426:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4427:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10334);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral10344); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4434:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4437:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4438:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4438:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4438:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4438:2: ()
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4439:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXTypeLiteral10390); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleXTypeLiteral10402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4452:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4453:1: ( ruleQualifiedName )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4453:1: ( ruleQualifiedName )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4454:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10425);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleXTypeLiteral10437); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4479:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4480:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4481:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10473);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10483); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4488:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4491:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4492:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4492:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4492:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4492:2: ()
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4493:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXThrowExpression10529); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4502:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4503:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4503:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4504:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10550);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4528:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4529:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4530:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10586);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10596); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4537:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4540:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4541:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4541:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4541:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4541:2: ()
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4542:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXReturnExpression10642); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4551:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt77=2;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4551:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4556:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4557:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10673);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4581:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4582:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4583:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10710);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10720); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4590:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4593:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4594:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4594:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4594:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4594:2: ()
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4595:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXTryCatchFinallyExpression10766); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4604:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4605:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4605:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4606:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10787);
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

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4622:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==75) ) {
                alt80=1;
            }
            else if ( (LA80_0==74) ) {
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4622:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4622:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4622:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4622:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt78=0;
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==75) ) {
                            int LA78_2 = input.LA(2);

                            if ( (synpred36_InternalMongoBeans()) ) {
                                alt78=1;
                            }


                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4622:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4624:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4625:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10817);
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

                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4641:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==74) ) {
                        int LA79_1 = input.LA(2);

                        if ( (synpred37_InternalMongoBeans()) ) {
                            alt79=1;
                        }
                    }
                    switch (alt79) {
                        case 1 :
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4641:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4641:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4641:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleXTryCatchFinallyExpression10839); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4646:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4647:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4647:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4648:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10861);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4665:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4665:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4665:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,74,FOLLOW_74_in_ruleXTryCatchFinallyExpression10883); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4669:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4670:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4670:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4671:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10904);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4695:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4696:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4697:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10942);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10952); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4704:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4707:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4708:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4708:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4708:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4708:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4708:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleXCatchClause10997); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleXCatchClause11010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4717:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4718:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4718:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4719:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause11031);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleXCatchClause11043); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4739:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4740:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4740:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4741:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause11064);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4765:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4766:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4767:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11101);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName11112); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4774:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4777:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4778:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4778:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4779:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11159);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4789:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==46) ) {
                    int LA81_2 = input.LA(2);

                    if ( (LA81_2==RULE_ID) ) {
                        int LA81_3 = input.LA(3);

                        if ( (synpred39_InternalMongoBeans()) ) {
                            alt81=1;
                        }


                    }


                }


                switch (alt81) {
            	case 1 :
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4789:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4789:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4789:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,46,FOLLOW_46_in_ruleQualifiedName11187); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11210);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4816:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4820:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4821:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber11264);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber11275); if (state.failed) return current;

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4831:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4835:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4836:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4836:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4836:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber11319); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4844:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4844:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4844:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4844:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
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
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4844:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11347); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4852:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11373); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4859:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==46) ) {
                        int LA84_1 = input.LA(2);

                        if ( ((LA84_1>=RULE_INT && LA84_1<=RULE_DECIMAL)) ) {
                            alt84=1;
                        }
                    }
                    switch (alt84) {
                        case 1 :
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4860:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,46,FOLLOW_46_in_ruleNumber11393); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4865:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
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
                                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4865:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11409); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4873:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11435); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4891:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4892:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4893:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11488);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference11498); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4900:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4903:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4904:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4904:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_ID) ) {
                alt87=1;
            }
            else if ( (LA87_0==18||LA87_0==35) ) {
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4904:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4904:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4905:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11546);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4913:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==49) ) {
                            int LA86_2 = input.LA(2);

                            if ( (LA86_2==51) ) {
                                int LA86_3 = input.LA(3);

                                if ( (synpred40_InternalMongoBeans()) ) {
                                    alt86=1;
                                }


                            }


                        }


                        switch (alt86) {
                    	case 1 :
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4913:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4916:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4916:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4916:6: ()
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4917:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleJvmTypeReference11584); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleJvmTypeReference11596); if (state.failed) return current;
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4932:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11628);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4948:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4949:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4950:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11663);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11673); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4957:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4960:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4961:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4961:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4961:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4961:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==18) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4961:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleXFunctionTypeRef11711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4965:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==RULE_ID||LA89_0==18||LA89_0==35) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4965:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4965:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4966:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4966:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4967:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11733);
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

                            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4983:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop88:
                            do {
                                int alt88=2;
                                int LA88_0 = input.LA(1);

                                if ( (LA88_0==19) ) {
                                    alt88=1;
                                }


                                switch (alt88) {
                            	case 1 :
                            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4983:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXFunctionTypeRef11746); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4987:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4988:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4988:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4989:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11767);
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

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleXFunctionTypeRef11783); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleXFunctionTypeRef11797); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5013:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5014:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5014:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5015:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11818);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5039:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5040:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5041:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11854);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11864); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5048:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5051:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5052:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5052:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5052:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5052:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5053:1: ( ruleQualifiedName )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5053:1: ( ruleQualifiedName )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5054:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11912);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5067:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt92=2;
            alt92 = dfa92.predict(input);
            switch (alt92) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5067:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5067:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5067:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleJvmParameterizedTypeReference11933); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5072:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5073:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5073:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5074:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11955);
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

                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5090:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==19) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5090:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleJvmParameterizedTypeReference11968); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5094:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5095:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5095:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5096:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11989);
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

                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleJvmParameterizedTypeReference12003); if (state.failed) return current;
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5124:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5125:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5126:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12041);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12051); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5133:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5136:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5137:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5137:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_ID||LA93_0==18||LA93_0==35) ) {
                alt93=1;
            }
            else if ( (LA93_0==76) ) {
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5138:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12098);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5148:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12125);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5164:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5165:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5166:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12160);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12170); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5173:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5176:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5177:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5177:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5177:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5177:2: ()
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5178:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleJvmWildcardTypeReference12216); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5187:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt94=3;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==77) ) {
                alt94=1;
            }
            else if ( (LA94_0==64) ) {
                alt94=2;
            }
            switch (alt94) {
                case 1 :
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5187:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5187:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5188:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5188:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5189:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12238);
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
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5206:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5206:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5207:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5207:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5208:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12265);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5232:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5233:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5234:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12303);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound12313); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5241:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5244:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5245:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5245:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5245:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleJvmUpperBound12350); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5249:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5250:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5250:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5251:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12371);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5275:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5276:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5277:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12407);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12417); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5284:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5287:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5288:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5288:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5288:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleJvmUpperBoundAnded12454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5292:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5293:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5293:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5294:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12475);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5318:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5319:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5320:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12511);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12521); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5327:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5330:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5331:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5331:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5331:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleJvmLowerBound12558); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5335:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5336:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5336:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5337:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12579);
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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5363:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5364:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5365:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12618);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12629); if (state.failed) return current;

            }

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
    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5372:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5375:28: (this_ID_0= RULE_ID )
            // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5376:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12668); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalMongoBeans
    public final void synpred1_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:346:3: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) '(' ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:346:4: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) '(' )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:346:4: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) '(' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:346:5: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) '('
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:346:5: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:347:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:347:1: ( ruleJvmTypeReference )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:348:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred1_InternalMongoBeans755);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:350:2: ( ( ruleValidID ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:351:1: ( ruleValidID )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:351:1: ( ruleValidID )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:352:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred1_InternalMongoBeans764);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,18,FOLLOW_18_in_synpred1_InternalMongoBeans770); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalMongoBeans

    // $ANTLR start synpred3_InternalMongoBeans
    public final void synpred3_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:743:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:743:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:743:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:743:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:743:5: ()
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:744:1: 
        {
        }

        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:744:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:745:1: ( ruleOpMultiAssign )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:745:1: ( ruleOpMultiAssign )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:746:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred3_InternalMongoBeans1640);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalMongoBeans

    // $ANTLR start synpred4_InternalMongoBeans
    public final void synpred4_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:871:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:871:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:871:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:871:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:871:5: ()
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:872:1: 
        {
        }

        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:872:2: ( ( ruleOpOr ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:873:1: ( ruleOpOr )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:873:1: ( ruleOpOr )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:874:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred4_InternalMongoBeans1988);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalMongoBeans

    // $ANTLR start synpred5_InternalMongoBeans
    public final void synpred5_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:972:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:972:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:972:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:972:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:972:5: ()
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:973:1: 
        {
        }

        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:973:2: ( ( ruleOpAnd ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:974:1: ( ruleOpAnd )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:974:1: ( ruleOpAnd )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:975:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred5_InternalMongoBeans2247);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalMongoBeans

    // $ANTLR start synpred6_InternalMongoBeans
    public final void synpred6_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1073:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1073:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1073:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1073:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1073:5: ()
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1074:1: 
        {
        }

        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1074:2: ( ( ruleOpEquality ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1075:1: ( ruleOpEquality )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1075:1: ( ruleOpEquality )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1076:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred6_InternalMongoBeans2506);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalMongoBeans

    // $ANTLR start synpred7_InternalMongoBeans
    public final void synpred7_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1181:4: ( ( () 'instanceof' ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1181:5: ( () 'instanceof' )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1181:5: ( () 'instanceof' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1181:6: () 'instanceof'
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1181:6: ()
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1182:1: 
        {
        }

        match(input,28,FOLLOW_28_in_synpred7_InternalMongoBeans2782); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalMongoBeans

    // $ANTLR start synpred8_InternalMongoBeans
    public final void synpred8_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1212:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1212:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1212:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1212:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1212:10: ()
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1213:1: 
        {
        }

        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1213:2: ( ( ruleOpCompare ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1214:1: ( ruleOpCompare )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1214:1: ( ruleOpCompare )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1215:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred8_InternalMongoBeans2853);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalMongoBeans

    // $ANTLR start synpred9_InternalMongoBeans
    public final void synpred9_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1334:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1334:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1334:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1334:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1334:5: ()
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1335:1: 
        {
        }

        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1335:2: ( ( ruleOpOther ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1336:1: ( ruleOpOther )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1336:1: ( ruleOpOther )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1337:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred9_InternalMongoBeans3172);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalMongoBeans

    // $ANTLR start synpred10_InternalMongoBeans
    public final void synpred10_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1426:3: ( ( '>' '>' ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1426:4: ( '>' '>' )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1426:4: ( '>' '>' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1427:2: '>' '>'
        {
        match(input,31,FOLLOW_31_in_synpred10_InternalMongoBeans3388); if (state.failed) return ;
        match(input,31,FOLLOW_31_in_synpred10_InternalMongoBeans3393); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalMongoBeans

    // $ANTLR start synpred11_InternalMongoBeans
    public final void synpred11_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1456:3: ( ( '<' '<' ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1456:4: ( '<' '<' )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1456:4: ( '<' '<' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1457:2: '<' '<'
        {
        match(input,32,FOLLOW_32_in_synpred11_InternalMongoBeans3475); if (state.failed) return ;
        match(input,32,FOLLOW_32_in_synpred11_InternalMongoBeans3480); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalMongoBeans

    // $ANTLR start synpred12_InternalMongoBeans
    public final void synpred12_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1530:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1530:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1530:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1530:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1530:5: ()
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1531:1: 
        {
        }

        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1531:2: ( ( ruleOpAdd ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1532:1: ( ruleOpAdd )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1532:1: ( ruleOpAdd )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1533:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred12_InternalMongoBeans3702);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred12_InternalMongoBeans

    // $ANTLR start synpred13_InternalMongoBeans
    public final void synpred13_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1638:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1638:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1638:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1638:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1638:5: ()
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1639:1: 
        {
        }

        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1639:2: ( ( ruleOpMulti ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1640:1: ( ruleOpMulti )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1640:1: ( ruleOpMulti )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1641:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred13_InternalMongoBeans3982);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred13_InternalMongoBeans

    // $ANTLR start synpred14_InternalMongoBeans
    public final void synpred14_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1871:3: ( ( () 'as' ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1871:4: ( () 'as' )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1871:4: ( () 'as' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1871:5: () 'as'
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1871:5: ()
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1872:1: 
        {
        }

        match(input,45,FOLLOW_45_in_synpred14_InternalMongoBeans4576); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalMongoBeans

    // $ANTLR start synpred15_InternalMongoBeans
    public final void synpred15_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1931:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1931:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1931:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1931:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1931:6: ()
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1932:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred15_InternalMongoBeans4730); if (state.failed) return ;
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1933:1: ( ( ruleValidID ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1934:1: ( ruleValidID )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1934:1: ( ruleValidID )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1935:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred15_InternalMongoBeans4739);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred15_InternalMongoBeans4745);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalMongoBeans

    // $ANTLR start synpred16_InternalMongoBeans
    public final void synpred16_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1989:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1989:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1989:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1989:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1989:10: ()
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1990:1: 
        {
        }

        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1990:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt95=3;
        switch ( input.LA(1) ) {
        case 46:
            {
            alt95=1;
            }
            break;
        case 47:
            {
            alt95=2;
            }
            break;
        case 48:
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
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1990:4: '.'
                {
                match(input,46,FOLLOW_46_in_synpred16_InternalMongoBeans4848); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1992:6: ( ( '?.' ) )
                {
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1992:6: ( ( '?.' ) )
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1993:1: ( '?.' )
                {
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1993:1: ( '?.' )
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1994:2: '?.'
                {
                match(input,47,FOLLOW_47_in_synpred16_InternalMongoBeans4862); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1999:6: ( ( '*.' ) )
                {
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:1999:6: ( ( '*.' ) )
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2000:1: ( '*.' )
                {
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2000:1: ( '*.' )
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2001:2: '*.'
                {
                match(input,48,FOLLOW_48_in_synpred16_InternalMongoBeans4882); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred16_InternalMongoBeans

    // $ANTLR start synpred17_InternalMongoBeans
    public final void synpred17_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2110:4: ( ( '(' ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2111:1: ( '(' )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2111:1: ( '(' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2112:2: '('
        {
        match(input,18,FOLLOW_18_in_synpred17_InternalMongoBeans5109); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalMongoBeans

    // $ANTLR start synpred18_InternalMongoBeans
    public final void synpred18_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2131:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2131:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2131:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2131:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2131:6: ()
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2132:1: 
        {
        }

        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2132:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt97=2;
        int LA97_0 = input.LA(1);

        if ( (LA97_0==RULE_ID||LA97_0==18||LA97_0==35) ) {
            alt97=1;
        }
        switch (alt97) {
            case 1 :
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2132:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2132:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2133:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2133:1: ( ruleJvmFormalParameter )
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2134:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalMongoBeans5161);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2136:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop96:
                do {
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==19) ) {
                        alt96=1;
                    }


                    switch (alt96) {
                	case 1 :
                	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2136:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,19,FOLLOW_19_in_synpred18_InternalMongoBeans5168); if (state.failed) return ;
                	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2137:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2138:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2138:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2139:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalMongoBeans5175);
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

        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2141:6: ( ( '|' ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2142:1: ( '|' )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2142:1: ( '|' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2143:2: '|'
        {
        match(input,50,FOLLOW_50_in_synpred18_InternalMongoBeans5189); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred18_InternalMongoBeans

    // $ANTLR start synpred19_InternalMongoBeans
    public final void synpred19_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2210:4: ( ( () '[' ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2210:5: ( () '[' )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2210:5: ( () '[' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2210:6: () '['
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2210:6: ()
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2211:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred19_InternalMongoBeans5309); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalMongoBeans

    // $ANTLR start synpred20_InternalMongoBeans
    public final void synpred20_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2401:3: ( ( () '[' ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2401:4: ( () '[' )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2401:4: ( () '[' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2401:5: () '['
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2401:5: ()
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2402:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred20_InternalMongoBeans5833); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalMongoBeans

    // $ANTLR start synpred22_InternalMongoBeans
    public final void synpred22_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2495:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2495:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2495:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2495:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2495:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( (LA99_0==RULE_ID||LA99_0==18||LA99_0==35) ) {
            alt99=1;
        }
        switch (alt99) {
            case 1 :
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2495:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2495:7: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2496:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2496:1: ( ruleJvmFormalParameter )
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2497:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalMongoBeans6112);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2499:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop98:
                do {
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==19) ) {
                        alt98=1;
                    }


                    switch (alt98) {
                	case 1 :
                	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2499:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,19,FOLLOW_19_in_synpred22_InternalMongoBeans6119); if (state.failed) return ;
                	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2500:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2501:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2501:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2502:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalMongoBeans6126);
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

        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2504:6: ( ( '|' ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2505:1: ( '|' )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2505:1: ( '|' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2506:2: '|'
        {
        match(input,50,FOLLOW_50_in_synpred22_InternalMongoBeans6140); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalMongoBeans

    // $ANTLR start synpred24_InternalMongoBeans
    public final void synpred24_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2865:4: ( 'else' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2865:6: 'else'
        {
        match(input,54,FOLLOW_54_in_synpred24_InternalMongoBeans6923); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalMongoBeans

    // $ANTLR start synpred25_InternalMongoBeans
    public final void synpred25_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2919:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2919:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2919:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2919:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2919:6: ( ( ruleValidID ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2920:1: ( ruleValidID )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2920:1: ( ruleValidID )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2921:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalMongoBeans7065);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,56,FOLLOW_56_in_synpred25_InternalMongoBeans7071); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalMongoBeans

    // $ANTLR start synpred26_InternalMongoBeans
    public final void synpred26_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2965:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2965:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2965:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2965:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,18,FOLLOW_18_in_synpred26_InternalMongoBeans7147); if (state.failed) return ;
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2966:1: ( ( ruleValidID ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2967:1: ( ruleValidID )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2967:1: ( ruleValidID )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:2968:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred26_InternalMongoBeans7154);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,56,FOLLOW_56_in_synpred26_InternalMongoBeans7160); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalMongoBeans

    // $ANTLR start synpred27_InternalMongoBeans
    public final void synpred27_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3549:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3549:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3549:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3549:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3549:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3550:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3550:1: ( ruleJvmTypeReference )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3551:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred27_InternalMongoBeans8425);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3553:2: ( ( ruleValidID ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3554:1: ( ruleValidID )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3554:1: ( ruleValidID )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3555:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred27_InternalMongoBeans8434);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalMongoBeans

    // $ANTLR start synpred28_InternalMongoBeans
    public final void synpred28_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3853:4: ( ( '(' ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3854:1: ( '(' )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3854:1: ( '(' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3855:2: '('
        {
        match(input,18,FOLLOW_18_in_synpred28_InternalMongoBeans8996); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalMongoBeans

    // $ANTLR start synpred29_InternalMongoBeans
    public final void synpred29_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3874:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3874:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3874:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3874:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3874:6: ()
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3875:1: 
        {
        }

        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3875:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt103=2;
        int LA103_0 = input.LA(1);

        if ( (LA103_0==RULE_ID||LA103_0==18||LA103_0==35) ) {
            alt103=1;
        }
        switch (alt103) {
            case 1 :
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3875:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3875:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3876:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3876:1: ( ruleJvmFormalParameter )
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3877:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred29_InternalMongoBeans9048);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3879:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop102:
                do {
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==19) ) {
                        alt102=1;
                    }


                    switch (alt102) {
                	case 1 :
                	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3879:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,19,FOLLOW_19_in_synpred29_InternalMongoBeans9055); if (state.failed) return ;
                	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3880:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3881:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3881:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3882:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred29_InternalMongoBeans9062);
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

        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3884:6: ( ( '|' ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3885:1: ( '|' )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3885:1: ( '|' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3886:2: '|'
        {
        match(input,50,FOLLOW_50_in_synpred29_InternalMongoBeans9076); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred29_InternalMongoBeans

    // $ANTLR start synpred30_InternalMongoBeans
    public final void synpred30_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3953:4: ( ( () '[' ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3953:5: ( () '[' )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3953:5: ( () '[' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3953:6: () '['
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3953:6: ()
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:3954:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred30_InternalMongoBeans9196); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred30_InternalMongoBeans

    // $ANTLR start synpred31_InternalMongoBeans
    public final void synpred31_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4096:4: ( '<' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4096:6: '<'
        {
        match(input,32,FOLLOW_32_in_synpred31_InternalMongoBeans9583); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalMongoBeans

    // $ANTLR start synpred32_InternalMongoBeans
    public final void synpred32_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4145:5: ( '(' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4145:7: '('
        {
        match(input,18,FOLLOW_18_in_synpred32_InternalMongoBeans9676); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalMongoBeans

    // $ANTLR start synpred33_InternalMongoBeans
    public final void synpred33_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4150:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4150:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4150:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4150:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4150:6: ()
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4151:1: 
        {
        }

        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4151:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt105=2;
        int LA105_0 = input.LA(1);

        if ( (LA105_0==RULE_ID||LA105_0==18||LA105_0==35) ) {
            alt105=1;
        }
        switch (alt105) {
            case 1 :
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4151:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4151:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4152:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4152:1: ( ruleJvmFormalParameter )
                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4153:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred33_InternalMongoBeans9706);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4155:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop104:
                do {
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==19) ) {
                        alt104=1;
                    }


                    switch (alt104) {
                	case 1 :
                	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4155:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,19,FOLLOW_19_in_synpred33_InternalMongoBeans9713); if (state.failed) return ;
                	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4156:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4157:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4157:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4158:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred33_InternalMongoBeans9720);
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

        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4160:6: ( ( '|' ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4161:1: ( '|' )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4161:1: ( '|' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4162:2: '|'
        {
        match(input,50,FOLLOW_50_in_synpred33_InternalMongoBeans9734); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred33_InternalMongoBeans

    // $ANTLR start synpred34_InternalMongoBeans
    public final void synpred34_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4229:4: ( ( () '[' ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4229:5: ( () '[' )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4229:5: ( () '[' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4229:6: () '['
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4229:6: ()
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4230:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred34_InternalMongoBeans9854); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred34_InternalMongoBeans

    // $ANTLR start synpred35_InternalMongoBeans
    public final void synpred35_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4551:2: ( ( ruleXExpression ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4552:1: ( ruleXExpression )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4552:1: ( ruleXExpression )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4553:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred35_InternalMongoBeans10656);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred35_InternalMongoBeans

    // $ANTLR start synpred36_InternalMongoBeans
    public final void synpred36_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4622:5: ( 'catch' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4622:7: 'catch'
        {
        match(input,75,FOLLOW_75_in_synpred36_InternalMongoBeans10801); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalMongoBeans

    // $ANTLR start synpred37_InternalMongoBeans
    public final void synpred37_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4641:5: ( 'finally' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4641:7: 'finally'
        {
        match(input,74,FOLLOW_74_in_synpred37_InternalMongoBeans10831); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalMongoBeans

    // $ANTLR start synpred39_InternalMongoBeans
    public final void synpred39_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4789:3: ( '.' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4790:2: '.'
        {
        match(input,46,FOLLOW_46_in_synpred39_InternalMongoBeans11178); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalMongoBeans

    // $ANTLR start synpred40_InternalMongoBeans
    public final void synpred40_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4913:2: ( ( () '[' ']' ) )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4913:3: ( () '[' ']' )
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4913:3: ( () '[' ']' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4913:4: () '[' ']'
        {
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4913:4: ()
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:4914:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred40_InternalMongoBeans11561); if (state.failed) return ;
        match(input,51,FOLLOW_51_in_synpred40_InternalMongoBeans11565); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred40_InternalMongoBeans

    // $ANTLR start synpred41_InternalMongoBeans
    public final void synpred41_InternalMongoBeans_fragment() throws RecognitionException {   
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5067:4: ( '<' )
        // ../org.xtext.mongobeans/src-gen/org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.g:5067:6: '<'
        {
        match(input,32,FOLLOW_32_in_synpred41_InternalMongoBeans11925); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_InternalMongoBeans

    // Delegated rules

    public final boolean synpred17_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalMongoBeans() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalMongoBeans_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA36 dfa36 = new DFA36(this);
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
    static final String DFA19_eotS =
        "\13\uffff";
    static final String DFA19_eofS =
        "\1\1\12\uffff";
    static final String DFA19_minS =
        "\1\4\1\uffff\10\0\1\uffff";
    static final String DFA19_maxS =
        "\1\113\1\uffff\10\0\1\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA19_specialS =
        "\2\uffff\1\1\1\5\1\2\1\7\1\0\1\6\1\4\1\3\1\uffff}>";
    static final String[] DFA19_transitionS = {
            "\5\1\6\uffff\6\1\2\uffff\10\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1"+
            "\11\13\1\1\uffff\16\1\1\uffff\12\1",
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

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "()* loopback of 1334:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_6 = input.LA(1);

                         
                        int index19_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMongoBeans()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_2 = input.LA(1);

                         
                        int index19_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMongoBeans()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_4 = input.LA(1);

                         
                        int index19_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMongoBeans()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_9 = input.LA(1);

                         
                        int index19_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMongoBeans()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_8 = input.LA(1);

                         
                        int index19_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMongoBeans()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_3 = input.LA(1);

                         
                        int index19_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMongoBeans()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA19_7 = input.LA(1);

                         
                        int index19_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMongoBeans()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA19_5 = input.LA(1);

                         
                        int index19_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMongoBeans()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA35_eotS =
        "\101\uffff";
    static final String DFA35_eofS =
        "\1\2\100\uffff";
    static final String DFA35_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA35_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA35_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA35_transitionS = {
            "\5\2\6\uffff\3\2\1\1\2\2\2\uffff\33\2\1\uffff\16\2\1\uffff\12"+
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
            return "2110:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
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
                        if ( (synpred17_InternalMongoBeans()) ) {s = 64;}

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
    static final String DFA34_eotS =
        "\36\uffff";
    static final String DFA34_eofS =
        "\36\uffff";
    static final String DFA34_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA34_maxS =
        "\1\111\2\0\33\uffff";
    static final String DFA34_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA34_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA34_transitionS = {
            "\4\5\1\1\6\uffff\1\5\2\uffff\1\2\1\uffff\1\35\13\uffff\1\5\2"+
            "\uffff\1\3\3\uffff\2\5\3\uffff\1\5\4\uffff\1\5\1\4\2\uffff\1"+
            "\5\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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
            return "2131:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA34_0==18) ) {s = 2;}

                        else if ( (LA34_0==35) && (synpred18_InternalMongoBeans())) {s = 3;}

                        else if ( (LA34_0==50) && (synpred18_InternalMongoBeans())) {s = 4;}

                        else if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_DECIMAL)||LA34_0==15||LA34_0==32||(LA34_0>=39 && LA34_0<=40)||LA34_0==44||LA34_0==49||LA34_0==53||LA34_0==55||(LA34_0>=59 && LA34_0<=61)||LA34_0==64||(LA34_0>=66 && LA34_0<=73)) ) {s = 5;}

                        else if ( (LA34_0==20) ) {s = 29;}

                         
                        input.seek(index34_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalMongoBeans()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalMongoBeans()) ) {s = 4;}

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
    static final String DFA36_eotS =
        "\101\uffff";
    static final String DFA36_eofS =
        "\1\2\100\uffff";
    static final String DFA36_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA36_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA36_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA36_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA36_transitionS = {
            "\5\2\6\uffff\6\2\2\uffff\32\2\1\1\1\uffff\16\2\1\uffff\12\2",
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
            return "2210:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
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
                        if ( (synpred19_InternalMongoBeans()) ) {s = 64;}

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
    static final String DFA38_eotS =
        "\16\uffff";
    static final String DFA38_eofS =
        "\16\uffff";
    static final String DFA38_minS =
        "\1\4\15\uffff";
    static final String DFA38_maxS =
        "\1\111\15\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA38_specialS =
        "\16\uffff}>";
    static final String[] DFA38_transitionS = {
            "\4\5\1\4\6\uffff\1\2\2\uffff\1\15\15\uffff\1\4\20\uffff\1\5"+
            "\3\uffff\1\6\1\uffff\1\3\3\uffff\1\7\1\10\1\11\2\uffff\1\4\1"+
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
            return "2251:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA42_eotS =
        "\40\uffff";
    static final String DFA42_eofS =
        "\40\uffff";
    static final String DFA42_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA42_maxS =
        "\1\111\2\0\35\uffff";
    static final String DFA42_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA42_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA42_transitionS = {
            "\4\5\1\1\6\uffff\1\5\2\uffff\1\2\15\uffff\1\5\2\uffff\1\3\3"+
            "\uffff\2\5\3\uffff\1\5\4\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff"+
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
            return "2495:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
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

                        else if ( (LA42_0==18) ) {s = 2;}

                        else if ( (LA42_0==35) && (synpred22_InternalMongoBeans())) {s = 3;}

                        else if ( (LA42_0==50) && (synpred22_InternalMongoBeans())) {s = 4;}

                        else if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_DECIMAL)||LA42_0==15||LA42_0==32||(LA42_0>=39 && LA42_0<=40)||LA42_0==44||LA42_0==49||LA42_0==51||LA42_0==53||LA42_0==55||(LA42_0>=59 && LA42_0<=64)||(LA42_0>=66 && LA42_0<=73)) ) {s = 5;}

                         
                        input.seek(index42_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_1 = input.LA(1);

                         
                        int index42_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMongoBeans()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index42_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA42_2 = input.LA(1);

                         
                        int index42_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMongoBeans()) ) {s = 4;}

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
        "\101\uffff";
    static final String DFA66_eofS =
        "\1\2\100\uffff";
    static final String DFA66_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA66_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA66_transitionS = {
            "\5\2\6\uffff\3\2\1\1\2\2\2\uffff\33\2\1\uffff\16\2\1\uffff\12"+
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
            return "3853:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred28_InternalMongoBeans()) ) {s = 64;}

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
        "\1\111\2\0\33\uffff";
    static final String DFA65_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA65_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA65_transitionS = {
            "\4\5\1\1\6\uffff\1\5\2\uffff\1\2\1\uffff\1\35\13\uffff\1\5\2"+
            "\uffff\1\3\3\uffff\2\5\3\uffff\1\5\4\uffff\1\5\1\4\2\uffff\1"+
            "\5\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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
            return "3874:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA65_0==18) ) {s = 2;}

                        else if ( (LA65_0==35) && (synpred29_InternalMongoBeans())) {s = 3;}

                        else if ( (LA65_0==50) && (synpred29_InternalMongoBeans())) {s = 4;}

                        else if ( ((LA65_0>=RULE_STRING && LA65_0<=RULE_DECIMAL)||LA65_0==15||LA65_0==32||(LA65_0>=39 && LA65_0<=40)||LA65_0==44||LA65_0==49||LA65_0==53||LA65_0==55||(LA65_0>=59 && LA65_0<=61)||LA65_0==64||(LA65_0>=66 && LA65_0<=73)) ) {s = 5;}

                        else if ( (LA65_0==20) ) {s = 29;}

                         
                        input.seek(index65_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalMongoBeans()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA65_2 = input.LA(1);

                         
                        int index65_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalMongoBeans()) ) {s = 4;}

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
        "\1\113\1\0\77\uffff";
    static final String DFA67_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA67_transitionS = {
            "\5\2\6\uffff\6\2\2\uffff\32\2\1\1\1\uffff\16\2\1\uffff\12\2",
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
            return "3953:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred30_InternalMongoBeans()) ) {s = 64;}

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
        "\101\uffff";
    static final String DFA71_eofS =
        "\1\2\100\uffff";
    static final String DFA71_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA71_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA71_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA71_transitionS = {
            "\5\2\6\uffff\6\2\2\uffff\11\2\1\1\21\2\1\uffff\16\2\1\uffff"+
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
            return "4096:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
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
                        if ( (synpred31_InternalMongoBeans()) ) {s = 64;}

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
        "\101\uffff";
    static final String DFA74_eofS =
        "\1\2\100\uffff";
    static final String DFA74_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA74_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA74_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA74_transitionS = {
            "\5\2\6\uffff\3\2\1\1\2\2\2\uffff\33\2\1\uffff\16\2\1\uffff\12"+
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
            return "4145:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred32_InternalMongoBeans()) ) {s = 64;}

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
        "\1\111\2\0\33\uffff";
    static final String DFA73_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA73_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA73_transitionS = {
            "\4\5\1\1\6\uffff\1\5\2\uffff\1\2\1\uffff\1\35\13\uffff\1\5\2"+
            "\uffff\1\3\3\uffff\2\5\3\uffff\1\5\4\uffff\1\5\1\4\2\uffff\1"+
            "\5\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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
            return "4150:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA73_0==18) ) {s = 2;}

                        else if ( (LA73_0==35) && (synpred33_InternalMongoBeans())) {s = 3;}

                        else if ( (LA73_0==50) && (synpred33_InternalMongoBeans())) {s = 4;}

                        else if ( ((LA73_0>=RULE_STRING && LA73_0<=RULE_DECIMAL)||LA73_0==15||LA73_0==32||(LA73_0>=39 && LA73_0<=40)||LA73_0==44||LA73_0==49||LA73_0==53||LA73_0==55||(LA73_0>=59 && LA73_0<=61)||LA73_0==64||(LA73_0>=66 && LA73_0<=73)) ) {s = 5;}

                        else if ( (LA73_0==20) ) {s = 29;}

                         
                        input.seek(index73_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalMongoBeans()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_2 = input.LA(1);

                         
                        int index73_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalMongoBeans()) ) {s = 4;}

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
        "\101\uffff";
    static final String DFA75_eofS =
        "\1\2\100\uffff";
    static final String DFA75_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA75_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA75_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA75_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA75_transitionS = {
            "\5\2\6\uffff\6\2\2\uffff\32\2\1\1\1\uffff\16\2\1\uffff\12\2",
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
            return "4229:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred34_InternalMongoBeans()) ) {s = 64;}

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
        "\101\uffff";
    static final String DFA77_eofS =
        "\1\33\100\uffff";
    static final String DFA77_minS =
        "\1\4\32\0\46\uffff";
    static final String DFA77_maxS =
        "\1\113\32\0\46\uffff";
    static final String DFA77_acceptS =
        "\33\uffff\1\2\44\uffff\1\1";
    static final String DFA77_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\46\uffff}>";
    static final String[] DFA77_transitionS = {
            "\1\21\1\15\1\16\1\17\1\1\6\uffff\1\6\2\33\1\32\2\33\2\uffff"+
            "\11\33\1\10\6\33\1\4\1\3\3\33\1\2\4\33\1\12\1\uffff\2\33\1\23"+
            "\1\33\1\7\3\33\1\24\1\25\1\26\2\33\1\11\1\uffff\1\5\1\13\1\14"+
            "\1\20\1\22\1\27\1\30\1\31\2\33",
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
            return "4551:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA77_2 = input.LA(1);

                         
                        int index77_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA77_3 = input.LA(1);

                         
                        int index77_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA77_4 = input.LA(1);

                         
                        int index77_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA77_5 = input.LA(1);

                         
                        int index77_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA77_6 = input.LA(1);

                         
                        int index77_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA77_7 = input.LA(1);

                         
                        int index77_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA77_8 = input.LA(1);

                         
                        int index77_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA77_9 = input.LA(1);

                         
                        int index77_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA77_10 = input.LA(1);

                         
                        int index77_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA77_11 = input.LA(1);

                         
                        int index77_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA77_12 = input.LA(1);

                         
                        int index77_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA77_13 = input.LA(1);

                         
                        int index77_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA77_14 = input.LA(1);

                         
                        int index77_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA77_15 = input.LA(1);

                         
                        int index77_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA77_16 = input.LA(1);

                         
                        int index77_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA77_17 = input.LA(1);

                         
                        int index77_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA77_18 = input.LA(1);

                         
                        int index77_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA77_19 = input.LA(1);

                         
                        int index77_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA77_20 = input.LA(1);

                         
                        int index77_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA77_21 = input.LA(1);

                         
                        int index77_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA77_22 = input.LA(1);

                         
                        int index77_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA77_23 = input.LA(1);

                         
                        int index77_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA77_24 = input.LA(1);

                         
                        int index77_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA77_25 = input.LA(1);

                         
                        int index77_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA77_26 = input.LA(1);

                         
                        int index77_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalMongoBeans()) ) {s = 64;}

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
        "\101\uffff";
    static final String DFA92_eofS =
        "\1\2\100\uffff";
    static final String DFA92_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA92_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA92_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA92_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA92_transitionS = {
            "\5\2\6\uffff\6\2\2\uffff\11\2\1\1\21\2\1\uffff\16\2\1\uffff"+
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
            return "5067:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
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
                        if ( (synpred41_InternalMongoBeans()) ) {s = 64;}

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
 

    public static final BitSet FOLLOW_ruleMongoFile_in_entryRuleMongoFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMongoFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleMongoFile130 = new BitSet(new long[]{0x0000000000006102L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImport213 = new BitSet(new long[]{0x0000400000006100L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleAbstractElement327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleAbstractElement354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMongoBean_in_ruleAbstractElement381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePackageDeclaration463 = new BitSet(new long[]{0x0000400000006100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration484 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePackageDeclaration496 = new BitSet(new long[]{0x0000000000016100L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rulePackageDeclaration517 = new BitSet(new long[]{0x0000000000016100L});
    public static final BitSet FOLLOW_16_in_rulePackageDeclaration530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMongoBean_in_entryRuleMongoBean566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMongoBean576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMongoBean622 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMongoBean634 = new BitSet(new long[]{0x0000400800076100L});
    public static final BitSet FOLLOW_ruleAbstractFeature_in_ruleMongoBean655 = new BitSet(new long[]{0x0000400800076100L});
    public static final BitSet FOLLOW_16_in_ruleMongoBean668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFeature_in_entryRuleAbstractFeature704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractFeature714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMongoOperation_in_ruleAbstractFeature789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMongoProperty_in_ruleAbstractFeature817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMongoProperty_in_entryRuleMongoProperty852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMongoProperty862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleMongoProperty909 = new BitSet(new long[]{0x0000000000026100L});
    public static final BitSet FOLLOW_ruleMongoBean_in_ruleMongoProperty936 = new BitSet(new long[]{0x0000000000026100L});
    public static final BitSet FOLLOW_17_in_ruleMongoProperty955 = new BitSet(new long[]{0x0000000000006100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMongoProperty990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMongoOperation_in_entryRuleMongoOperation1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMongoOperation1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleMongoOperation1111 = new BitSet(new long[]{0x0000000000046100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMongoOperation1132 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMongoOperation1144 = new BitSet(new long[]{0x0000400800146100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleMongoOperation1168 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleMongoOperation1181 = new BitSet(new long[]{0x0000400800046100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleMongoOperation1202 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleMongoOperation1218 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleMongoOperation1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard1334 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleQualifiedNameWithWildcard1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1553 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1569 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1619 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1672 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpSingleAssign1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpMultiAssign1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1967 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression2020 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2043 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpOr2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2226 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2279 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2302 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpAnd2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2485 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2538 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2561 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpEquality2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpEquality2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2765 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_28_in_ruleXRelationalExpression2801 = new BitSet(new long[]{0x0000400800046100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2824 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2885 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2908 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpCompare2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpCompare3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpCompare3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpCompare3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3151 = new BitSet(new long[]{0x0000007F80000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3204 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3227 = new BitSet(new long[]{0x0000007F80000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpOther3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOther3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther3373 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleOpOther3404 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleOpOther3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther3460 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleOpOther3491 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleOpOther3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpOther3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpOther3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpOther3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3681 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3734 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3757 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpAdd3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpAdd3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3961 = new BitSet(new long[]{0x00000E0000020002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4014 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4037 = new BitSet(new long[]{0x00000E0000020002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti4076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpMulti4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpMulti4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpMulti4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpMulti4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation4232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4290 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpUnary4425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpUnary4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpUnary4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4560 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleXCastedExpression4595 = new BitSet(new long[]{0x0000400800046100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4618 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4713 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall4762 = new BitSet(new long[]{0x0000000000406100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4785 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4801 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4823 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall4909 = new BitSet(new long[]{0x0003C00100046100L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall4933 = new BitSet(new long[]{0x0003C00100046100L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall4970 = new BitSet(new long[]{0x0003C00100046100L});
    public static final BitSet FOLLOW_32_in_ruleXMemberFeatureCall4999 = new BitSet(new long[]{0x0000400800046100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5020 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_19_in_ruleXMemberFeatureCall5033 = new BitSet(new long[]{0x0000400800046100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5054 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_31_in_ruleXMemberFeatureCall5068 = new BitSet(new long[]{0x0003C00000046100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5093 = new BitSet(new long[]{0x0003C00000040002L});
    public static final BitSet FOLLOW_18_in_ruleXMemberFeatureCall5127 = new BitSet(new long[]{0x38A651890054E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5212 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5240 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleXMemberFeatureCall5253 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5274 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleXMemberFeatureCall5291 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5326 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression5376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure6023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure6033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXClosure6093 = new BitSet(new long[]{0xF8AE51890044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6166 = new BitSet(new long[]{0x0004000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXClosure6179 = new BitSet(new long[]{0x0000400800046100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6200 = new BitSet(new long[]{0x0004000000080000L});
    public static final BitSet FOLLOW_50_in_ruleXClosure6222 = new BitSet(new long[]{0xF8AA11810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6259 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXClosure6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure6317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6373 = new BitSet(new long[]{0xF8B211810044E1F2L,0x00000000000003FFL});
    public static final BitSet FOLLOW_52_in_ruleXExpressionInClosure6386 = new BitSet(new long[]{0xF8A211810044E1F2L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6544 = new BitSet(new long[]{0x0004000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXShortClosure6557 = new BitSet(new long[]{0x0000400800046100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6578 = new BitSet(new long[]{0x0004000000080000L});
    public static final BitSet FOLLOW_50_in_ruleXShortClosure6600 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleXParenthesizedExpression6719 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6741 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXParenthesizedExpression6752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXIfExpression6844 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXIfExpression6856 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6877 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXIfExpression6889 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6910 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXIfExpression6931 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression7001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression7047 = new BitSet(new long[]{0x39A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7090 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression7102 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7126 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_18_in_ruleXSwitchExpression7170 = new BitSet(new long[]{0x0100000000006100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7191 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression7203 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7226 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXSwitchExpression7238 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXSwitchExpression7252 = new BitSet(new long[]{0x0500400800046100L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7273 = new BitSet(new long[]{0x0700400800056100L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression7287 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression7299 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7320 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXSwitchExpression7334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7426 = new BitSet(new long[]{0x0500000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXCasePart7440 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7461 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXCasePart7475 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXForLoopExpression7588 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXForLoopExpression7600 = new BitSet(new long[]{0x0000400800046100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7621 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXForLoopExpression7633 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7654 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXForLoopExpression7666 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXWhileExpression7779 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXWhileExpression7791 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7812 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXWhileExpression7824 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXDoWhileExpression7937 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7958 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXDoWhileExpression7970 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXDoWhileExpression7982 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8003 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXDoWhileExpression8015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression8061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleXBlockExpression8107 = new BitSet(new long[]{0xF8A211810045E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8129 = new BitSet(new long[]{0xF8B211810045E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_52_in_ruleXBlockExpression8142 = new BitSet(new long[]{0xF8A211810045E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_16_in_ruleXBlockExpression8158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXVariableDeclaration8376 = new BitSet(new long[]{0x0000400800446100L});
    public static final BitSet FOLLOW_63_in_ruleXVariableDeclaration8407 = new BitSet(new long[]{0x0000400800446100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8455 = new BitSet(new long[]{0x0000000000406100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8476 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8505 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleXVariableDeclaration8519 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8634 = new BitSet(new long[]{0x0000000000006100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8748 = new BitSet(new long[]{0x0000000000006100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8872 = new BitSet(new long[]{0x0000000100006100L,0x0000000000000003L});
    public static final BitSet FOLLOW_32_in_ruleXFeatureCall8886 = new BitSet(new long[]{0x0000400800046100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8907 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_19_in_ruleXFeatureCall8920 = new BitSet(new long[]{0x0000400800046100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8941 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_31_in_ruleXFeatureCall8955 = new BitSet(new long[]{0x0000000100006100L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8980 = new BitSet(new long[]{0x0002000000040002L});
    public static final BitSet FOLLOW_18_in_ruleXFeatureCall9014 = new BitSet(new long[]{0x38A651890054E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9099 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9127 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleXFeatureCall9140 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9161 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleXFeatureCall9178 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall9213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper9262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper9309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleIdOrSuper9333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier9385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier9432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleStaticQualifier9450 = new BitSet(new long[]{0x0000000000006102L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXConstructorCall9547 = new BitSet(new long[]{0x0000400000006100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9570 = new BitSet(new long[]{0x0002000100040002L});
    public static final BitSet FOLLOW_32_in_ruleXConstructorCall9591 = new BitSet(new long[]{0x0000400800046100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9613 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_19_in_ruleXConstructorCall9626 = new BitSet(new long[]{0x0000400800046100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9647 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_31_in_ruleXConstructorCall9661 = new BitSet(new long[]{0x0002000000040002L});
    public static final BitSet FOLLOW_18_in_ruleXConstructorCall9684 = new BitSet(new long[]{0x38A651890054E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9757 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9785 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleXConstructorCall9798 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9819 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleXConstructorCall9836 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXBooleanLiteral9965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXBooleanLiteral9989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral10049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXNullLiteral10095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral10131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral10141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral10196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral10242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral10293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral10344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXTypeLiteral10390 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXTypeLiteral10402 = new BitSet(new long[]{0x0000400000006100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10425 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXTypeLiteral10437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXThrowExpression10529 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXReturnExpression10642 = new BitSet(new long[]{0x38A211810044E1F2L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXTryCatchFinallyExpression10766 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10817 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_74_in_ruleXTryCatchFinallyExpression10839 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXTryCatchFinallyExpression10883 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXCatchClause10997 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXCatchClause11010 = new BitSet(new long[]{0x0000400800046100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause11031 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXCatchClause11043 = new BitSet(new long[]{0x38A211810044E1F0L,0x00000000000003FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause11064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName11112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11159 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleQualifiedName11187 = new BitSet(new long[]{0x0000400000006100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11210 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber11264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber11275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber11319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11347 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11373 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleNumber11393 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference11498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11546 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleJvmTypeReference11584 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleJvmTypeReference11596 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleXFunctionTypeRef11711 = new BitSet(new long[]{0x0000400800146100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11733 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleXFunctionTypeRef11746 = new BitSet(new long[]{0x0000400800046100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11767 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleXFunctionTypeRef11783 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleXFunctionTypeRef11797 = new BitSet(new long[]{0x0000400800046100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11912 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleJvmParameterizedTypeReference11933 = new BitSet(new long[]{0x0000400800046100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11955 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_19_in_ruleJvmParameterizedTypeReference11968 = new BitSet(new long[]{0x0000400800046100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11989 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_31_in_ruleJvmParameterizedTypeReference12003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmWildcardTypeReference12216 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002001L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound12313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJvmUpperBound12350 = new BitSet(new long[]{0x0000400800046100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleJvmUpperBoundAnded12454 = new BitSet(new long[]{0x0000400800046100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleJvmLowerBound12558 = new BitSet(new long[]{0x0000400800046100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred1_InternalMongoBeans755 = new BitSet(new long[]{0x0000000000046100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred1_InternalMongoBeans764 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred1_InternalMongoBeans770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred3_InternalMongoBeans1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred4_InternalMongoBeans1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred5_InternalMongoBeans2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred6_InternalMongoBeans2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred7_InternalMongoBeans2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred8_InternalMongoBeans2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred9_InternalMongoBeans3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred10_InternalMongoBeans3388 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred10_InternalMongoBeans3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred11_InternalMongoBeans3475 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_synpred11_InternalMongoBeans3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred12_InternalMongoBeans3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred13_InternalMongoBeans3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred14_InternalMongoBeans4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred15_InternalMongoBeans4730 = new BitSet(new long[]{0x0000000000406100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred15_InternalMongoBeans4739 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred15_InternalMongoBeans4745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred16_InternalMongoBeans4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred16_InternalMongoBeans4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred16_InternalMongoBeans4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred17_InternalMongoBeans5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalMongoBeans5161 = new BitSet(new long[]{0x0004000000080000L});
    public static final BitSet FOLLOW_19_in_synpred18_InternalMongoBeans5168 = new BitSet(new long[]{0x0000400800046100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalMongoBeans5175 = new BitSet(new long[]{0x0004000000080000L});
    public static final BitSet FOLLOW_50_in_synpred18_InternalMongoBeans5189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred19_InternalMongoBeans5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred20_InternalMongoBeans5833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalMongoBeans6112 = new BitSet(new long[]{0x0004000000080000L});
    public static final BitSet FOLLOW_19_in_synpred22_InternalMongoBeans6119 = new BitSet(new long[]{0x0000400800046100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalMongoBeans6126 = new BitSet(new long[]{0x0004000000080000L});
    public static final BitSet FOLLOW_50_in_synpred22_InternalMongoBeans6140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred24_InternalMongoBeans6923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalMongoBeans7065 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred25_InternalMongoBeans7071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred26_InternalMongoBeans7147 = new BitSet(new long[]{0x0100000000006100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred26_InternalMongoBeans7154 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred26_InternalMongoBeans7160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred27_InternalMongoBeans8425 = new BitSet(new long[]{0x0000000000006100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred27_InternalMongoBeans8434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred28_InternalMongoBeans8996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred29_InternalMongoBeans9048 = new BitSet(new long[]{0x0004000000080000L});
    public static final BitSet FOLLOW_19_in_synpred29_InternalMongoBeans9055 = new BitSet(new long[]{0x0000400800046100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred29_InternalMongoBeans9062 = new BitSet(new long[]{0x0004000000080000L});
    public static final BitSet FOLLOW_50_in_synpred29_InternalMongoBeans9076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred30_InternalMongoBeans9196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred31_InternalMongoBeans9583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred32_InternalMongoBeans9676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred33_InternalMongoBeans9706 = new BitSet(new long[]{0x0004000000080000L});
    public static final BitSet FOLLOW_19_in_synpred33_InternalMongoBeans9713 = new BitSet(new long[]{0x0000400800046100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred33_InternalMongoBeans9720 = new BitSet(new long[]{0x0004000000080000L});
    public static final BitSet FOLLOW_50_in_synpred33_InternalMongoBeans9734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred34_InternalMongoBeans9854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred35_InternalMongoBeans10656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_synpred36_InternalMongoBeans10801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_synpred37_InternalMongoBeans10831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred39_InternalMongoBeans11178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred40_InternalMongoBeans11561 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_synpred40_InternalMongoBeans11565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred41_InternalMongoBeans11925 = new BitSet(new long[]{0x0000000000000002L});

}