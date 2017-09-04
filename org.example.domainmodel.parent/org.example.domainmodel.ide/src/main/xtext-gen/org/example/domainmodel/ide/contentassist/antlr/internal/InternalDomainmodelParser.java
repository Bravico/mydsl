package org.example.domainmodel.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.example.domainmodel.services.DomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_NAMEFORMATE", "RULE_DATEFORMATE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'title='", "','", "'date='", "'tags='", "'['", "']'", "'tag'", "'blog'", "'articles'"
    };
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=4;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_DATEFORMATE=6;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_NAMEFORMATE=5;
    public static final int RULE_INT=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDomainmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainmodelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomainmodel.g"; }


    	private DomainmodelGrammarAccess grammarAccess;

    	public void setGrammarAccess(DomainmodelGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDomainmodel"
    // InternalDomainmodel.g:53:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // InternalDomainmodel.g:54:1: ( ruleDomainmodel EOF )
            // InternalDomainmodel.g:55:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalDomainmodel.g:62:1: ruleDomainmodel : ( ( rule__Domainmodel__Group__0 ) ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:66:2: ( ( ( rule__Domainmodel__Group__0 ) ) )
            // InternalDomainmodel.g:67:2: ( ( rule__Domainmodel__Group__0 ) )
            {
            // InternalDomainmodel.g:67:2: ( ( rule__Domainmodel__Group__0 ) )
            // InternalDomainmodel.g:68:3: ( rule__Domainmodel__Group__0 )
            {
             before(grammarAccess.getDomainmodelAccess().getGroup()); 
            // InternalDomainmodel.g:69:3: ( rule__Domainmodel__Group__0 )
            // InternalDomainmodel.g:69:4: rule__Domainmodel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Domainmodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainmodelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleType"
    // InternalDomainmodel.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalDomainmodel.g:82:1: ( ruleType EOF )
            // InternalDomainmodel.g:83:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDomainmodel.g:93:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:98:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalDomainmodel.g:99:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalDomainmodel.g:99:2: ( ( rule__Type__Alternatives ) )
            // InternalDomainmodel.g:100:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalDomainmodel.g:101:3: ( rule__Type__Alternatives )
            // InternalDomainmodel.g:101:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleblog"
    // InternalDomainmodel.g:111:1: entryRuleblog : ruleblog EOF ;
    public final void entryRuleblog() throws RecognitionException {
        try {
            // InternalDomainmodel.g:112:1: ( ruleblog EOF )
            // InternalDomainmodel.g:113:1: ruleblog EOF
            {
             before(grammarAccess.getBlogRule()); 
            pushFollow(FOLLOW_1);
            ruleblog();

            state._fsp--;

             after(grammarAccess.getBlogRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleblog"


    // $ANTLR start "ruleblog"
    // InternalDomainmodel.g:120:1: ruleblog : ( ( rule__Blog__Group__0 ) ) ;
    public final void ruleblog() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:124:2: ( ( ( rule__Blog__Group__0 ) ) )
            // InternalDomainmodel.g:125:2: ( ( rule__Blog__Group__0 ) )
            {
            // InternalDomainmodel.g:125:2: ( ( rule__Blog__Group__0 ) )
            // InternalDomainmodel.g:126:3: ( rule__Blog__Group__0 )
            {
             before(grammarAccess.getBlogAccess().getGroup()); 
            // InternalDomainmodel.g:127:3: ( rule__Blog__Group__0 )
            // InternalDomainmodel.g:127:4: rule__Blog__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Blog__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlogAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleblog"


    // $ANTLR start "entryRulearticles"
    // InternalDomainmodel.g:136:1: entryRulearticles : rulearticles EOF ;
    public final void entryRulearticles() throws RecognitionException {
        try {
            // InternalDomainmodel.g:137:1: ( rulearticles EOF )
            // InternalDomainmodel.g:138:1: rulearticles EOF
            {
             before(grammarAccess.getArticlesRule()); 
            pushFollow(FOLLOW_1);
            rulearticles();

            state._fsp--;

             after(grammarAccess.getArticlesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulearticles"


    // $ANTLR start "rulearticles"
    // InternalDomainmodel.g:145:1: rulearticles : ( ( rule__Articles__Group__0 ) ) ;
    public final void rulearticles() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:149:2: ( ( ( rule__Articles__Group__0 ) ) )
            // InternalDomainmodel.g:150:2: ( ( rule__Articles__Group__0 ) )
            {
            // InternalDomainmodel.g:150:2: ( ( rule__Articles__Group__0 ) )
            // InternalDomainmodel.g:151:3: ( rule__Articles__Group__0 )
            {
             before(grammarAccess.getArticlesAccess().getGroup()); 
            // InternalDomainmodel.g:152:3: ( rule__Articles__Group__0 )
            // InternalDomainmodel.g:152:4: rule__Articles__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Articles__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArticlesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulearticles"


    // $ANTLR start "entryRuleFeature"
    // InternalDomainmodel.g:161:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalDomainmodel.g:162:1: ( ruleFeature EOF )
            // InternalDomainmodel.g:163:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalDomainmodel.g:170:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:174:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalDomainmodel.g:175:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalDomainmodel.g:175:2: ( ( rule__Feature__Group__0 ) )
            // InternalDomainmodel.g:176:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalDomainmodel.g:177:3: ( rule__Feature__Group__0 )
            // InternalDomainmodel.g:177:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuletag"
    // InternalDomainmodel.g:186:1: entryRuletag : ruletag EOF ;
    public final void entryRuletag() throws RecognitionException {
        try {
            // InternalDomainmodel.g:187:1: ( ruletag EOF )
            // InternalDomainmodel.g:188:1: ruletag EOF
            {
             before(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            ruletag();

            state._fsp--;

             after(grammarAccess.getTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletag"


    // $ANTLR start "ruletag"
    // InternalDomainmodel.g:195:1: ruletag : ( ( rule__Tag__Group__0 ) ) ;
    public final void ruletag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:199:2: ( ( ( rule__Tag__Group__0 ) ) )
            // InternalDomainmodel.g:200:2: ( ( rule__Tag__Group__0 ) )
            {
            // InternalDomainmodel.g:200:2: ( ( rule__Tag__Group__0 ) )
            // InternalDomainmodel.g:201:3: ( rule__Tag__Group__0 )
            {
             before(grammarAccess.getTagAccess().getGroup()); 
            // InternalDomainmodel.g:202:3: ( rule__Tag__Group__0 )
            // InternalDomainmodel.g:202:4: rule__Tag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletag"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalDomainmodel.g:210:1: rule__Type__Alternatives : ( ( ( rule__Type__BlogAssignment_0 ) ) | ( ( rule__Type__ArticlesAssignment_1 ) ) | ( ( rule__Type__CommentAssignment_2 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:214:1: ( ( ( rule__Type__BlogAssignment_0 ) ) | ( ( rule__Type__ArticlesAssignment_1 ) ) | ( ( rule__Type__CommentAssignment_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case RULE_SL_COMMENT:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDomainmodel.g:215:2: ( ( rule__Type__BlogAssignment_0 ) )
                    {
                    // InternalDomainmodel.g:215:2: ( ( rule__Type__BlogAssignment_0 ) )
                    // InternalDomainmodel.g:216:3: ( rule__Type__BlogAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getBlogAssignment_0()); 
                    // InternalDomainmodel.g:217:3: ( rule__Type__BlogAssignment_0 )
                    // InternalDomainmodel.g:217:4: rule__Type__BlogAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__BlogAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getBlogAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:221:2: ( ( rule__Type__ArticlesAssignment_1 ) )
                    {
                    // InternalDomainmodel.g:221:2: ( ( rule__Type__ArticlesAssignment_1 ) )
                    // InternalDomainmodel.g:222:3: ( rule__Type__ArticlesAssignment_1 )
                    {
                     before(grammarAccess.getTypeAccess().getArticlesAssignment_1()); 
                    // InternalDomainmodel.g:223:3: ( rule__Type__ArticlesAssignment_1 )
                    // InternalDomainmodel.g:223:4: rule__Type__ArticlesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__ArticlesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getArticlesAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:227:2: ( ( rule__Type__CommentAssignment_2 ) )
                    {
                    // InternalDomainmodel.g:227:2: ( ( rule__Type__CommentAssignment_2 ) )
                    // InternalDomainmodel.g:228:3: ( rule__Type__CommentAssignment_2 )
                    {
                     before(grammarAccess.getTypeAccess().getCommentAssignment_2()); 
                    // InternalDomainmodel.g:229:3: ( rule__Type__CommentAssignment_2 )
                    // InternalDomainmodel.g:229:4: rule__Type__CommentAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__CommentAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getCommentAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Domainmodel__Group__0"
    // InternalDomainmodel.g:237:1: rule__Domainmodel__Group__0 : rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1 ;
    public final void rule__Domainmodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:241:1: ( rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1 )
            // InternalDomainmodel.g:242:2: rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Domainmodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domainmodel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__Group__0"


    // $ANTLR start "rule__Domainmodel__Group__0__Impl"
    // InternalDomainmodel.g:249:1: rule__Domainmodel__Group__0__Impl : ( ( rule__Domainmodel__ElementsAssignment_0 )* ) ;
    public final void rule__Domainmodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:253:1: ( ( ( rule__Domainmodel__ElementsAssignment_0 )* ) )
            // InternalDomainmodel.g:254:1: ( ( rule__Domainmodel__ElementsAssignment_0 )* )
            {
            // InternalDomainmodel.g:254:1: ( ( rule__Domainmodel__ElementsAssignment_0 )* )
            // InternalDomainmodel.g:255:2: ( rule__Domainmodel__ElementsAssignment_0 )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment_0()); 
            // InternalDomainmodel.g:256:2: ( rule__Domainmodel__ElementsAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDomainmodel.g:256:3: rule__Domainmodel__ElementsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Domainmodel__ElementsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__Group__0__Impl"


    // $ANTLR start "rule__Domainmodel__Group__1"
    // InternalDomainmodel.g:264:1: rule__Domainmodel__Group__1 : rule__Domainmodel__Group__1__Impl ;
    public final void rule__Domainmodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:268:1: ( rule__Domainmodel__Group__1__Impl )
            // InternalDomainmodel.g:269:2: rule__Domainmodel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domainmodel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__Group__1"


    // $ANTLR start "rule__Domainmodel__Group__1__Impl"
    // InternalDomainmodel.g:275:1: rule__Domainmodel__Group__1__Impl : ( ( ( rule__Domainmodel__ElementsAssignment_1 ) ) ( ( rule__Domainmodel__ElementsAssignment_1 )* ) ) ;
    public final void rule__Domainmodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:279:1: ( ( ( ( rule__Domainmodel__ElementsAssignment_1 ) ) ( ( rule__Domainmodel__ElementsAssignment_1 )* ) ) )
            // InternalDomainmodel.g:280:1: ( ( ( rule__Domainmodel__ElementsAssignment_1 ) ) ( ( rule__Domainmodel__ElementsAssignment_1 )* ) )
            {
            // InternalDomainmodel.g:280:1: ( ( ( rule__Domainmodel__ElementsAssignment_1 ) ) ( ( rule__Domainmodel__ElementsAssignment_1 )* ) )
            // InternalDomainmodel.g:281:2: ( ( rule__Domainmodel__ElementsAssignment_1 ) ) ( ( rule__Domainmodel__ElementsAssignment_1 )* )
            {
            // InternalDomainmodel.g:281:2: ( ( rule__Domainmodel__ElementsAssignment_1 ) )
            // InternalDomainmodel.g:282:3: ( rule__Domainmodel__ElementsAssignment_1 )
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment_1()); 
            // InternalDomainmodel.g:283:3: ( rule__Domainmodel__ElementsAssignment_1 )
            // InternalDomainmodel.g:283:4: rule__Domainmodel__ElementsAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__Domainmodel__ElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment_1()); 

            }

            // InternalDomainmodel.g:286:2: ( ( rule__Domainmodel__ElementsAssignment_1 )* )
            // InternalDomainmodel.g:287:3: ( rule__Domainmodel__ElementsAssignment_1 )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment_1()); 
            // InternalDomainmodel.g:288:3: ( rule__Domainmodel__ElementsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_SL_COMMENT||(LA3_0>=22 && LA3_0<=23)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDomainmodel.g:288:4: rule__Domainmodel__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Domainmodel__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__Group__1__Impl"


    // $ANTLR start "rule__Blog__Group__0"
    // InternalDomainmodel.g:298:1: rule__Blog__Group__0 : rule__Blog__Group__0__Impl rule__Blog__Group__1 ;
    public final void rule__Blog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:302:1: ( rule__Blog__Group__0__Impl rule__Blog__Group__1 )
            // InternalDomainmodel.g:303:2: rule__Blog__Group__0__Impl rule__Blog__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Blog__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Blog__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blog__Group__0"


    // $ANTLR start "rule__Blog__Group__0__Impl"
    // InternalDomainmodel.g:310:1: rule__Blog__Group__0__Impl : ( ( rule__Blog__NameAssignment_0 ) ) ;
    public final void rule__Blog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:314:1: ( ( ( rule__Blog__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:315:1: ( ( rule__Blog__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:315:1: ( ( rule__Blog__NameAssignment_0 ) )
            // InternalDomainmodel.g:316:2: ( rule__Blog__NameAssignment_0 )
            {
             before(grammarAccess.getBlogAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:317:2: ( rule__Blog__NameAssignment_0 )
            // InternalDomainmodel.g:317:3: rule__Blog__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Blog__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBlogAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blog__Group__0__Impl"


    // $ANTLR start "rule__Blog__Group__1"
    // InternalDomainmodel.g:325:1: rule__Blog__Group__1 : rule__Blog__Group__1__Impl rule__Blog__Group__2 ;
    public final void rule__Blog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:329:1: ( rule__Blog__Group__1__Impl rule__Blog__Group__2 )
            // InternalDomainmodel.g:330:2: rule__Blog__Group__1__Impl rule__Blog__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Blog__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Blog__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blog__Group__1"


    // $ANTLR start "rule__Blog__Group__1__Impl"
    // InternalDomainmodel.g:337:1: rule__Blog__Group__1__Impl : ( '{' ) ;
    public final void rule__Blog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:341:1: ( ( '{' ) )
            // InternalDomainmodel.g:342:1: ( '{' )
            {
            // InternalDomainmodel.g:342:1: ( '{' )
            // InternalDomainmodel.g:343:2: '{'
            {
             before(grammarAccess.getBlogAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBlogAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blog__Group__1__Impl"


    // $ANTLR start "rule__Blog__Group__2"
    // InternalDomainmodel.g:352:1: rule__Blog__Group__2 : rule__Blog__Group__2__Impl rule__Blog__Group__3 ;
    public final void rule__Blog__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:356:1: ( rule__Blog__Group__2__Impl rule__Blog__Group__3 )
            // InternalDomainmodel.g:357:2: rule__Blog__Group__2__Impl rule__Blog__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Blog__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Blog__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blog__Group__2"


    // $ANTLR start "rule__Blog__Group__2__Impl"
    // InternalDomainmodel.g:364:1: rule__Blog__Group__2__Impl : ( ( rule__Blog__FeatureAssignment_2 ) ) ;
    public final void rule__Blog__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:368:1: ( ( ( rule__Blog__FeatureAssignment_2 ) ) )
            // InternalDomainmodel.g:369:1: ( ( rule__Blog__FeatureAssignment_2 ) )
            {
            // InternalDomainmodel.g:369:1: ( ( rule__Blog__FeatureAssignment_2 ) )
            // InternalDomainmodel.g:370:2: ( rule__Blog__FeatureAssignment_2 )
            {
             before(grammarAccess.getBlogAccess().getFeatureAssignment_2()); 
            // InternalDomainmodel.g:371:2: ( rule__Blog__FeatureAssignment_2 )
            // InternalDomainmodel.g:371:3: rule__Blog__FeatureAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Blog__FeatureAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBlogAccess().getFeatureAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blog__Group__2__Impl"


    // $ANTLR start "rule__Blog__Group__3"
    // InternalDomainmodel.g:379:1: rule__Blog__Group__3 : rule__Blog__Group__3__Impl ;
    public final void rule__Blog__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:383:1: ( rule__Blog__Group__3__Impl )
            // InternalDomainmodel.g:384:2: rule__Blog__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Blog__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blog__Group__3"


    // $ANTLR start "rule__Blog__Group__3__Impl"
    // InternalDomainmodel.g:390:1: rule__Blog__Group__3__Impl : ( '}' ) ;
    public final void rule__Blog__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:394:1: ( ( '}' ) )
            // InternalDomainmodel.g:395:1: ( '}' )
            {
            // InternalDomainmodel.g:395:1: ( '}' )
            // InternalDomainmodel.g:396:2: '}'
            {
             before(grammarAccess.getBlogAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBlogAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blog__Group__3__Impl"


    // $ANTLR start "rule__Articles__Group__0"
    // InternalDomainmodel.g:406:1: rule__Articles__Group__0 : rule__Articles__Group__0__Impl rule__Articles__Group__1 ;
    public final void rule__Articles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:410:1: ( rule__Articles__Group__0__Impl rule__Articles__Group__1 )
            // InternalDomainmodel.g:411:2: rule__Articles__Group__0__Impl rule__Articles__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Articles__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Articles__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Articles__Group__0"


    // $ANTLR start "rule__Articles__Group__0__Impl"
    // InternalDomainmodel.g:418:1: rule__Articles__Group__0__Impl : ( ( rule__Articles__NameAssignment_0 ) ) ;
    public final void rule__Articles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:422:1: ( ( ( rule__Articles__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:423:1: ( ( rule__Articles__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:423:1: ( ( rule__Articles__NameAssignment_0 ) )
            // InternalDomainmodel.g:424:2: ( rule__Articles__NameAssignment_0 )
            {
             before(grammarAccess.getArticlesAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:425:2: ( rule__Articles__NameAssignment_0 )
            // InternalDomainmodel.g:425:3: rule__Articles__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Articles__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArticlesAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Articles__Group__0__Impl"


    // $ANTLR start "rule__Articles__Group__1"
    // InternalDomainmodel.g:433:1: rule__Articles__Group__1 : rule__Articles__Group__1__Impl rule__Articles__Group__2 ;
    public final void rule__Articles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:437:1: ( rule__Articles__Group__1__Impl rule__Articles__Group__2 )
            // InternalDomainmodel.g:438:2: rule__Articles__Group__1__Impl rule__Articles__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Articles__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Articles__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Articles__Group__1"


    // $ANTLR start "rule__Articles__Group__1__Impl"
    // InternalDomainmodel.g:445:1: rule__Articles__Group__1__Impl : ( '{' ) ;
    public final void rule__Articles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:449:1: ( ( '{' ) )
            // InternalDomainmodel.g:450:1: ( '{' )
            {
            // InternalDomainmodel.g:450:1: ( '{' )
            // InternalDomainmodel.g:451:2: '{'
            {
             before(grammarAccess.getArticlesAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getArticlesAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Articles__Group__1__Impl"


    // $ANTLR start "rule__Articles__Group__2"
    // InternalDomainmodel.g:460:1: rule__Articles__Group__2 : rule__Articles__Group__2__Impl rule__Articles__Group__3 ;
    public final void rule__Articles__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:464:1: ( rule__Articles__Group__2__Impl rule__Articles__Group__3 )
            // InternalDomainmodel.g:465:2: rule__Articles__Group__2__Impl rule__Articles__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Articles__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Articles__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Articles__Group__2"


    // $ANTLR start "rule__Articles__Group__2__Impl"
    // InternalDomainmodel.g:472:1: rule__Articles__Group__2__Impl : ( ( rule__Articles__FeatureAssignment_2 ) ) ;
    public final void rule__Articles__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:476:1: ( ( ( rule__Articles__FeatureAssignment_2 ) ) )
            // InternalDomainmodel.g:477:1: ( ( rule__Articles__FeatureAssignment_2 ) )
            {
            // InternalDomainmodel.g:477:1: ( ( rule__Articles__FeatureAssignment_2 ) )
            // InternalDomainmodel.g:478:2: ( rule__Articles__FeatureAssignment_2 )
            {
             before(grammarAccess.getArticlesAccess().getFeatureAssignment_2()); 
            // InternalDomainmodel.g:479:2: ( rule__Articles__FeatureAssignment_2 )
            // InternalDomainmodel.g:479:3: rule__Articles__FeatureAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Articles__FeatureAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArticlesAccess().getFeatureAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Articles__Group__2__Impl"


    // $ANTLR start "rule__Articles__Group__3"
    // InternalDomainmodel.g:487:1: rule__Articles__Group__3 : rule__Articles__Group__3__Impl ;
    public final void rule__Articles__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:491:1: ( rule__Articles__Group__3__Impl )
            // InternalDomainmodel.g:492:2: rule__Articles__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Articles__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Articles__Group__3"


    // $ANTLR start "rule__Articles__Group__3__Impl"
    // InternalDomainmodel.g:498:1: rule__Articles__Group__3__Impl : ( '}' ) ;
    public final void rule__Articles__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:502:1: ( ( '}' ) )
            // InternalDomainmodel.g:503:1: ( '}' )
            {
            // InternalDomainmodel.g:503:1: ( '}' )
            // InternalDomainmodel.g:504:2: '}'
            {
             before(grammarAccess.getArticlesAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getArticlesAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Articles__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalDomainmodel.g:514:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:518:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalDomainmodel.g:519:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalDomainmodel.g:526:1: rule__Feature__Group__0__Impl : ( 'title=' ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:530:1: ( ( 'title=' ) )
            // InternalDomainmodel.g:531:1: ( 'title=' )
            {
            // InternalDomainmodel.g:531:1: ( 'title=' )
            // InternalDomainmodel.g:532:2: 'title='
            {
             before(grammarAccess.getFeatureAccess().getTitleKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalDomainmodel.g:541:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:545:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalDomainmodel.g:546:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalDomainmodel.g:553:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:557:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:558:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:558:1: ( ( rule__Feature__NameAssignment_1 ) )
            // InternalDomainmodel.g:559:2: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:560:2: ( rule__Feature__NameAssignment_1 )
            // InternalDomainmodel.g:560:3: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalDomainmodel.g:568:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:572:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalDomainmodel.g:573:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // InternalDomainmodel.g:580:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__Group_2__0 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:584:1: ( ( ( rule__Feature__Group_2__0 )? ) )
            // InternalDomainmodel.g:585:1: ( ( rule__Feature__Group_2__0 )? )
            {
            // InternalDomainmodel.g:585:1: ( ( rule__Feature__Group_2__0 )? )
            // InternalDomainmodel.g:586:2: ( rule__Feature__Group_2__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_2()); 
            // InternalDomainmodel.g:587:2: ( rule__Feature__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==17) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // InternalDomainmodel.g:587:3: rule__Feature__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // InternalDomainmodel.g:595:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:599:1: ( rule__Feature__Group__3__Impl )
            // InternalDomainmodel.g:600:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // InternalDomainmodel.g:606:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__Group_3__0 )? ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:610:1: ( ( ( rule__Feature__Group_3__0 )? ) )
            // InternalDomainmodel.g:611:1: ( ( rule__Feature__Group_3__0 )? )
            {
            // InternalDomainmodel.g:611:1: ( ( rule__Feature__Group_3__0 )? )
            // InternalDomainmodel.g:612:2: ( rule__Feature__Group_3__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_3()); 
            // InternalDomainmodel.g:613:2: ( rule__Feature__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDomainmodel.g:613:3: rule__Feature__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group_2__0"
    // InternalDomainmodel.g:622:1: rule__Feature__Group_2__0 : rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 ;
    public final void rule__Feature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:626:1: ( rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 )
            // InternalDomainmodel.g:627:2: rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Feature__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__0"


    // $ANTLR start "rule__Feature__Group_2__0__Impl"
    // InternalDomainmodel.g:634:1: rule__Feature__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Feature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:638:1: ( ( ',' ) )
            // InternalDomainmodel.g:639:1: ( ',' )
            {
            // InternalDomainmodel.g:639:1: ( ',' )
            // InternalDomainmodel.g:640:2: ','
            {
             before(grammarAccess.getFeatureAccess().getCommaKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__0__Impl"


    // $ANTLR start "rule__Feature__Group_2__1"
    // InternalDomainmodel.g:649:1: rule__Feature__Group_2__1 : rule__Feature__Group_2__1__Impl rule__Feature__Group_2__2 ;
    public final void rule__Feature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:653:1: ( rule__Feature__Group_2__1__Impl rule__Feature__Group_2__2 )
            // InternalDomainmodel.g:654:2: rule__Feature__Group_2__1__Impl rule__Feature__Group_2__2
            {
            pushFollow(FOLLOW_12);
            rule__Feature__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__1"


    // $ANTLR start "rule__Feature__Group_2__1__Impl"
    // InternalDomainmodel.g:661:1: rule__Feature__Group_2__1__Impl : ( 'date=' ) ;
    public final void rule__Feature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:665:1: ( ( 'date=' ) )
            // InternalDomainmodel.g:666:1: ( 'date=' )
            {
            // InternalDomainmodel.g:666:1: ( 'date=' )
            // InternalDomainmodel.g:667:2: 'date='
            {
             before(grammarAccess.getFeatureAccess().getDateKeyword_2_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getDateKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__1__Impl"


    // $ANTLR start "rule__Feature__Group_2__2"
    // InternalDomainmodel.g:676:1: rule__Feature__Group_2__2 : rule__Feature__Group_2__2__Impl ;
    public final void rule__Feature__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:680:1: ( rule__Feature__Group_2__2__Impl )
            // InternalDomainmodel.g:681:2: rule__Feature__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__2"


    // $ANTLR start "rule__Feature__Group_2__2__Impl"
    // InternalDomainmodel.g:687:1: rule__Feature__Group_2__2__Impl : ( ( rule__Feature__DateAssignment_2_2 ) ) ;
    public final void rule__Feature__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:691:1: ( ( ( rule__Feature__DateAssignment_2_2 ) ) )
            // InternalDomainmodel.g:692:1: ( ( rule__Feature__DateAssignment_2_2 ) )
            {
            // InternalDomainmodel.g:692:1: ( ( rule__Feature__DateAssignment_2_2 ) )
            // InternalDomainmodel.g:693:2: ( rule__Feature__DateAssignment_2_2 )
            {
             before(grammarAccess.getFeatureAccess().getDateAssignment_2_2()); 
            // InternalDomainmodel.g:694:2: ( rule__Feature__DateAssignment_2_2 )
            // InternalDomainmodel.g:694:3: rule__Feature__DateAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Feature__DateAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getDateAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__2__Impl"


    // $ANTLR start "rule__Feature__Group_3__0"
    // InternalDomainmodel.g:703:1: rule__Feature__Group_3__0 : rule__Feature__Group_3__0__Impl rule__Feature__Group_3__1 ;
    public final void rule__Feature__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:707:1: ( rule__Feature__Group_3__0__Impl rule__Feature__Group_3__1 )
            // InternalDomainmodel.g:708:2: rule__Feature__Group_3__0__Impl rule__Feature__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Feature__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_3__0"


    // $ANTLR start "rule__Feature__Group_3__0__Impl"
    // InternalDomainmodel.g:715:1: rule__Feature__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Feature__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:719:1: ( ( ',' ) )
            // InternalDomainmodel.g:720:1: ( ',' )
            {
            // InternalDomainmodel.g:720:1: ( ',' )
            // InternalDomainmodel.g:721:2: ','
            {
             before(grammarAccess.getFeatureAccess().getCommaKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_3__0__Impl"


    // $ANTLR start "rule__Feature__Group_3__1"
    // InternalDomainmodel.g:730:1: rule__Feature__Group_3__1 : rule__Feature__Group_3__1__Impl rule__Feature__Group_3__2 ;
    public final void rule__Feature__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:734:1: ( rule__Feature__Group_3__1__Impl rule__Feature__Group_3__2 )
            // InternalDomainmodel.g:735:2: rule__Feature__Group_3__1__Impl rule__Feature__Group_3__2
            {
            pushFollow(FOLLOW_14);
            rule__Feature__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_3__1"


    // $ANTLR start "rule__Feature__Group_3__1__Impl"
    // InternalDomainmodel.g:742:1: rule__Feature__Group_3__1__Impl : ( 'tags=' ) ;
    public final void rule__Feature__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:746:1: ( ( 'tags=' ) )
            // InternalDomainmodel.g:747:1: ( 'tags=' )
            {
            // InternalDomainmodel.g:747:1: ( 'tags=' )
            // InternalDomainmodel.g:748:2: 'tags='
            {
             before(grammarAccess.getFeatureAccess().getTagsKeyword_3_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getTagsKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_3__1__Impl"


    // $ANTLR start "rule__Feature__Group_3__2"
    // InternalDomainmodel.g:757:1: rule__Feature__Group_3__2 : rule__Feature__Group_3__2__Impl rule__Feature__Group_3__3 ;
    public final void rule__Feature__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:761:1: ( rule__Feature__Group_3__2__Impl rule__Feature__Group_3__3 )
            // InternalDomainmodel.g:762:2: rule__Feature__Group_3__2__Impl rule__Feature__Group_3__3
            {
            pushFollow(FOLLOW_15);
            rule__Feature__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_3__2"


    // $ANTLR start "rule__Feature__Group_3__2__Impl"
    // InternalDomainmodel.g:769:1: rule__Feature__Group_3__2__Impl : ( '[' ) ;
    public final void rule__Feature__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:773:1: ( ( '[' ) )
            // InternalDomainmodel.g:774:1: ( '[' )
            {
            // InternalDomainmodel.g:774:1: ( '[' )
            // InternalDomainmodel.g:775:2: '['
            {
             before(grammarAccess.getFeatureAccess().getLeftSquareBracketKeyword_3_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getLeftSquareBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_3__2__Impl"


    // $ANTLR start "rule__Feature__Group_3__3"
    // InternalDomainmodel.g:784:1: rule__Feature__Group_3__3 : rule__Feature__Group_3__3__Impl rule__Feature__Group_3__4 ;
    public final void rule__Feature__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:788:1: ( rule__Feature__Group_3__3__Impl rule__Feature__Group_3__4 )
            // InternalDomainmodel.g:789:2: rule__Feature__Group_3__3__Impl rule__Feature__Group_3__4
            {
            pushFollow(FOLLOW_15);
            rule__Feature__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_3__3"


    // $ANTLR start "rule__Feature__Group_3__3__Impl"
    // InternalDomainmodel.g:796:1: rule__Feature__Group_3__3__Impl : ( ( rule__Feature__Group_3_3__0 )? ) ;
    public final void rule__Feature__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:800:1: ( ( ( rule__Feature__Group_3_3__0 )? ) )
            // InternalDomainmodel.g:801:1: ( ( rule__Feature__Group_3_3__0 )? )
            {
            // InternalDomainmodel.g:801:1: ( ( rule__Feature__Group_3_3__0 )? )
            // InternalDomainmodel.g:802:2: ( rule__Feature__Group_3_3__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_3_3()); 
            // InternalDomainmodel.g:803:2: ( rule__Feature__Group_3_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDomainmodel.g:803:3: rule__Feature__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__Group_3_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_3__3__Impl"


    // $ANTLR start "rule__Feature__Group_3__4"
    // InternalDomainmodel.g:811:1: rule__Feature__Group_3__4 : rule__Feature__Group_3__4__Impl ;
    public final void rule__Feature__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:815:1: ( rule__Feature__Group_3__4__Impl )
            // InternalDomainmodel.g:816:2: rule__Feature__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_3__4"


    // $ANTLR start "rule__Feature__Group_3__4__Impl"
    // InternalDomainmodel.g:822:1: rule__Feature__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Feature__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:826:1: ( ( ']' ) )
            // InternalDomainmodel.g:827:1: ( ']' )
            {
            // InternalDomainmodel.g:827:1: ( ']' )
            // InternalDomainmodel.g:828:2: ']'
            {
             before(grammarAccess.getFeatureAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getRightSquareBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_3__4__Impl"


    // $ANTLR start "rule__Feature__Group_3_3__0"
    // InternalDomainmodel.g:838:1: rule__Feature__Group_3_3__0 : rule__Feature__Group_3_3__0__Impl rule__Feature__Group_3_3__1 ;
    public final void rule__Feature__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:842:1: ( rule__Feature__Group_3_3__0__Impl rule__Feature__Group_3_3__1 )
            // InternalDomainmodel.g:843:2: rule__Feature__Group_3_3__0__Impl rule__Feature__Group_3_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Feature__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_3_3__0"


    // $ANTLR start "rule__Feature__Group_3_3__0__Impl"
    // InternalDomainmodel.g:850:1: rule__Feature__Group_3_3__0__Impl : ( ( rule__Feature__Tag0Assignment_3_3_0 ) ) ;
    public final void rule__Feature__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:854:1: ( ( ( rule__Feature__Tag0Assignment_3_3_0 ) ) )
            // InternalDomainmodel.g:855:1: ( ( rule__Feature__Tag0Assignment_3_3_0 ) )
            {
            // InternalDomainmodel.g:855:1: ( ( rule__Feature__Tag0Assignment_3_3_0 ) )
            // InternalDomainmodel.g:856:2: ( rule__Feature__Tag0Assignment_3_3_0 )
            {
             before(grammarAccess.getFeatureAccess().getTag0Assignment_3_3_0()); 
            // InternalDomainmodel.g:857:2: ( rule__Feature__Tag0Assignment_3_3_0 )
            // InternalDomainmodel.g:857:3: rule__Feature__Tag0Assignment_3_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Tag0Assignment_3_3_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTag0Assignment_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_3_3__0__Impl"


    // $ANTLR start "rule__Feature__Group_3_3__1"
    // InternalDomainmodel.g:865:1: rule__Feature__Group_3_3__1 : rule__Feature__Group_3_3__1__Impl ;
    public final void rule__Feature__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:869:1: ( rule__Feature__Group_3_3__1__Impl )
            // InternalDomainmodel.g:870:2: rule__Feature__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_3_3__1"


    // $ANTLR start "rule__Feature__Group_3_3__1__Impl"
    // InternalDomainmodel.g:876:1: rule__Feature__Group_3_3__1__Impl : ( ( rule__Feature__Group_3_3_1__0 )* ) ;
    public final void rule__Feature__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:880:1: ( ( ( rule__Feature__Group_3_3_1__0 )* ) )
            // InternalDomainmodel.g:881:1: ( ( rule__Feature__Group_3_3_1__0 )* )
            {
            // InternalDomainmodel.g:881:1: ( ( rule__Feature__Group_3_3_1__0 )* )
            // InternalDomainmodel.g:882:2: ( rule__Feature__Group_3_3_1__0 )*
            {
             before(grammarAccess.getFeatureAccess().getGroup_3_3_1()); 
            // InternalDomainmodel.g:883:2: ( rule__Feature__Group_3_3_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDomainmodel.g:883:3: rule__Feature__Group_3_3_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Feature__Group_3_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getGroup_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_3_3__1__Impl"


    // $ANTLR start "rule__Feature__Group_3_3_1__0"
    // InternalDomainmodel.g:892:1: rule__Feature__Group_3_3_1__0 : rule__Feature__Group_3_3_1__0__Impl rule__Feature__Group_3_3_1__1 ;
    public final void rule__Feature__Group_3_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:896:1: ( rule__Feature__Group_3_3_1__0__Impl rule__Feature__Group_3_3_1__1 )
            // InternalDomainmodel.g:897:2: rule__Feature__Group_3_3_1__0__Impl rule__Feature__Group_3_3_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Feature__Group_3_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_3_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_3_3_1__0"


    // $ANTLR start "rule__Feature__Group_3_3_1__0__Impl"
    // InternalDomainmodel.g:904:1: rule__Feature__Group_3_3_1__0__Impl : ( ',' ) ;
    public final void rule__Feature__Group_3_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:908:1: ( ( ',' ) )
            // InternalDomainmodel.g:909:1: ( ',' )
            {
            // InternalDomainmodel.g:909:1: ( ',' )
            // InternalDomainmodel.g:910:2: ','
            {
             before(grammarAccess.getFeatureAccess().getCommaKeyword_3_3_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getCommaKeyword_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_3_3_1__0__Impl"


    // $ANTLR start "rule__Feature__Group_3_3_1__1"
    // InternalDomainmodel.g:919:1: rule__Feature__Group_3_3_1__1 : rule__Feature__Group_3_3_1__1__Impl ;
    public final void rule__Feature__Group_3_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:923:1: ( rule__Feature__Group_3_3_1__1__Impl )
            // InternalDomainmodel.g:924:2: rule__Feature__Group_3_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group_3_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_3_3_1__1"


    // $ANTLR start "rule__Feature__Group_3_3_1__1__Impl"
    // InternalDomainmodel.g:930:1: rule__Feature__Group_3_3_1__1__Impl : ( ( rule__Feature__Tag1Assignment_3_3_1_1 ) ) ;
    public final void rule__Feature__Group_3_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:934:1: ( ( ( rule__Feature__Tag1Assignment_3_3_1_1 ) ) )
            // InternalDomainmodel.g:935:1: ( ( rule__Feature__Tag1Assignment_3_3_1_1 ) )
            {
            // InternalDomainmodel.g:935:1: ( ( rule__Feature__Tag1Assignment_3_3_1_1 ) )
            // InternalDomainmodel.g:936:2: ( rule__Feature__Tag1Assignment_3_3_1_1 )
            {
             before(grammarAccess.getFeatureAccess().getTag1Assignment_3_3_1_1()); 
            // InternalDomainmodel.g:937:2: ( rule__Feature__Tag1Assignment_3_3_1_1 )
            // InternalDomainmodel.g:937:3: rule__Feature__Tag1Assignment_3_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Tag1Assignment_3_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTag1Assignment_3_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_3_3_1__1__Impl"


    // $ANTLR start "rule__Tag__Group__0"
    // InternalDomainmodel.g:946:1: rule__Tag__Group__0 : rule__Tag__Group__0__Impl rule__Tag__Group__1 ;
    public final void rule__Tag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:950:1: ( rule__Tag__Group__0__Impl rule__Tag__Group__1 )
            // InternalDomainmodel.g:951:2: rule__Tag__Group__0__Impl rule__Tag__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Tag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__0"


    // $ANTLR start "rule__Tag__Group__0__Impl"
    // InternalDomainmodel.g:958:1: rule__Tag__Group__0__Impl : ( 'tag' ) ;
    public final void rule__Tag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:962:1: ( ( 'tag' ) )
            // InternalDomainmodel.g:963:1: ( 'tag' )
            {
            // InternalDomainmodel.g:963:1: ( 'tag' )
            // InternalDomainmodel.g:964:2: 'tag'
            {
             before(grammarAccess.getTagAccess().getTagKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getTagKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__0__Impl"


    // $ANTLR start "rule__Tag__Group__1"
    // InternalDomainmodel.g:973:1: rule__Tag__Group__1 : rule__Tag__Group__1__Impl ;
    public final void rule__Tag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:977:1: ( rule__Tag__Group__1__Impl )
            // InternalDomainmodel.g:978:2: rule__Tag__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__1"


    // $ANTLR start "rule__Tag__Group__1__Impl"
    // InternalDomainmodel.g:984:1: rule__Tag__Group__1__Impl : ( ( rule__Tag__NameAssignment_1 ) ) ;
    public final void rule__Tag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:988:1: ( ( ( rule__Tag__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:989:1: ( ( rule__Tag__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:989:1: ( ( rule__Tag__NameAssignment_1 ) )
            // InternalDomainmodel.g:990:2: ( rule__Tag__NameAssignment_1 )
            {
             before(grammarAccess.getTagAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:991:2: ( rule__Tag__NameAssignment_1 )
            // InternalDomainmodel.g:991:3: rule__Tag__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tag__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__1__Impl"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment_0"
    // InternalDomainmodel.g:1000:1: rule__Domainmodel__ElementsAssignment_0 : ( ruletag ) ;
    public final void rule__Domainmodel__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1004:1: ( ( ruletag ) )
            // InternalDomainmodel.g:1005:2: ( ruletag )
            {
            // InternalDomainmodel.g:1005:2: ( ruletag )
            // InternalDomainmodel.g:1006:3: ruletag
            {
             before(grammarAccess.getDomainmodelAccess().getElementsTagParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruletag();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsTagParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__ElementsAssignment_0"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment_1"
    // InternalDomainmodel.g:1015:1: rule__Domainmodel__ElementsAssignment_1 : ( ruleType ) ;
    public final void rule__Domainmodel__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1019:1: ( ( ruleType ) )
            // InternalDomainmodel.g:1020:2: ( ruleType )
            {
            // InternalDomainmodel.g:1020:2: ( ruleType )
            // InternalDomainmodel.g:1021:3: ruleType
            {
             before(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__ElementsAssignment_1"


    // $ANTLR start "rule__Type__BlogAssignment_0"
    // InternalDomainmodel.g:1030:1: rule__Type__BlogAssignment_0 : ( ruleblog ) ;
    public final void rule__Type__BlogAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1034:1: ( ( ruleblog ) )
            // InternalDomainmodel.g:1035:2: ( ruleblog )
            {
            // InternalDomainmodel.g:1035:2: ( ruleblog )
            // InternalDomainmodel.g:1036:3: ruleblog
            {
             before(grammarAccess.getTypeAccess().getBlogBlogParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleblog();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getBlogBlogParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__BlogAssignment_0"


    // $ANTLR start "rule__Type__ArticlesAssignment_1"
    // InternalDomainmodel.g:1045:1: rule__Type__ArticlesAssignment_1 : ( rulearticles ) ;
    public final void rule__Type__ArticlesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1049:1: ( ( rulearticles ) )
            // InternalDomainmodel.g:1050:2: ( rulearticles )
            {
            // InternalDomainmodel.g:1050:2: ( rulearticles )
            // InternalDomainmodel.g:1051:3: rulearticles
            {
             before(grammarAccess.getTypeAccess().getArticlesArticlesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulearticles();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getArticlesArticlesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ArticlesAssignment_1"


    // $ANTLR start "rule__Type__CommentAssignment_2"
    // InternalDomainmodel.g:1060:1: rule__Type__CommentAssignment_2 : ( RULE_SL_COMMENT ) ;
    public final void rule__Type__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1064:1: ( ( RULE_SL_COMMENT ) )
            // InternalDomainmodel.g:1065:2: ( RULE_SL_COMMENT )
            {
            // InternalDomainmodel.g:1065:2: ( RULE_SL_COMMENT )
            // InternalDomainmodel.g:1066:3: RULE_SL_COMMENT
            {
             before(grammarAccess.getTypeAccess().getCommentSL_COMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_SL_COMMENT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getCommentSL_COMMENTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__CommentAssignment_2"


    // $ANTLR start "rule__Blog__NameAssignment_0"
    // InternalDomainmodel.g:1075:1: rule__Blog__NameAssignment_0 : ( ( 'blog' ) ) ;
    public final void rule__Blog__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1079:1: ( ( ( 'blog' ) ) )
            // InternalDomainmodel.g:1080:2: ( ( 'blog' ) )
            {
            // InternalDomainmodel.g:1080:2: ( ( 'blog' ) )
            // InternalDomainmodel.g:1081:3: ( 'blog' )
            {
             before(grammarAccess.getBlogAccess().getNameBlogKeyword_0_0()); 
            // InternalDomainmodel.g:1082:3: ( 'blog' )
            // InternalDomainmodel.g:1083:4: 'blog'
            {
             before(grammarAccess.getBlogAccess().getNameBlogKeyword_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBlogAccess().getNameBlogKeyword_0_0()); 

            }

             after(grammarAccess.getBlogAccess().getNameBlogKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blog__NameAssignment_0"


    // $ANTLR start "rule__Blog__FeatureAssignment_2"
    // InternalDomainmodel.g:1094:1: rule__Blog__FeatureAssignment_2 : ( ruleFeature ) ;
    public final void rule__Blog__FeatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1098:1: ( ( ruleFeature ) )
            // InternalDomainmodel.g:1099:2: ( ruleFeature )
            {
            // InternalDomainmodel.g:1099:2: ( ruleFeature )
            // InternalDomainmodel.g:1100:3: ruleFeature
            {
             before(grammarAccess.getBlogAccess().getFeatureFeatureParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getBlogAccess().getFeatureFeatureParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blog__FeatureAssignment_2"


    // $ANTLR start "rule__Articles__NameAssignment_0"
    // InternalDomainmodel.g:1109:1: rule__Articles__NameAssignment_0 : ( ( 'articles' ) ) ;
    public final void rule__Articles__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1113:1: ( ( ( 'articles' ) ) )
            // InternalDomainmodel.g:1114:2: ( ( 'articles' ) )
            {
            // InternalDomainmodel.g:1114:2: ( ( 'articles' ) )
            // InternalDomainmodel.g:1115:3: ( 'articles' )
            {
             before(grammarAccess.getArticlesAccess().getNameArticlesKeyword_0_0()); 
            // InternalDomainmodel.g:1116:3: ( 'articles' )
            // InternalDomainmodel.g:1117:4: 'articles'
            {
             before(grammarAccess.getArticlesAccess().getNameArticlesKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getArticlesAccess().getNameArticlesKeyword_0_0()); 

            }

             after(grammarAccess.getArticlesAccess().getNameArticlesKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Articles__NameAssignment_0"


    // $ANTLR start "rule__Articles__FeatureAssignment_2"
    // InternalDomainmodel.g:1128:1: rule__Articles__FeatureAssignment_2 : ( ruleFeature ) ;
    public final void rule__Articles__FeatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1132:1: ( ( ruleFeature ) )
            // InternalDomainmodel.g:1133:2: ( ruleFeature )
            {
            // InternalDomainmodel.g:1133:2: ( ruleFeature )
            // InternalDomainmodel.g:1134:3: ruleFeature
            {
             before(grammarAccess.getArticlesAccess().getFeatureFeatureParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getArticlesAccess().getFeatureFeatureParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Articles__FeatureAssignment_2"


    // $ANTLR start "rule__Feature__NameAssignment_1"
    // InternalDomainmodel.g:1143:1: rule__Feature__NameAssignment_1 : ( RULE_NAMEFORMATE ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1147:1: ( ( RULE_NAMEFORMATE ) )
            // InternalDomainmodel.g:1148:2: ( RULE_NAMEFORMATE )
            {
            // InternalDomainmodel.g:1148:2: ( RULE_NAMEFORMATE )
            // InternalDomainmodel.g:1149:3: RULE_NAMEFORMATE
            {
             before(grammarAccess.getFeatureAccess().getNameNAMEFORMATETerminalRuleCall_1_0()); 
            match(input,RULE_NAMEFORMATE,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getNameNAMEFORMATETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_1"


    // $ANTLR start "rule__Feature__DateAssignment_2_2"
    // InternalDomainmodel.g:1158:1: rule__Feature__DateAssignment_2_2 : ( RULE_DATEFORMATE ) ;
    public final void rule__Feature__DateAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1162:1: ( ( RULE_DATEFORMATE ) )
            // InternalDomainmodel.g:1163:2: ( RULE_DATEFORMATE )
            {
            // InternalDomainmodel.g:1163:2: ( RULE_DATEFORMATE )
            // InternalDomainmodel.g:1164:3: RULE_DATEFORMATE
            {
             before(grammarAccess.getFeatureAccess().getDateDATEFORMATETerminalRuleCall_2_2_0()); 
            match(input,RULE_DATEFORMATE,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getDateDATEFORMATETerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__DateAssignment_2_2"


    // $ANTLR start "rule__Feature__Tag0Assignment_3_3_0"
    // InternalDomainmodel.g:1173:1: rule__Feature__Tag0Assignment_3_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__Tag0Assignment_3_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1177:1: ( ( ( RULE_ID ) ) )
            // InternalDomainmodel.g:1178:2: ( ( RULE_ID ) )
            {
            // InternalDomainmodel.g:1178:2: ( ( RULE_ID ) )
            // InternalDomainmodel.g:1179:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getTag0TagCrossReference_3_3_0_0()); 
            // InternalDomainmodel.g:1180:3: ( RULE_ID )
            // InternalDomainmodel.g:1181:4: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getTag0TagIDTerminalRuleCall_3_3_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getTag0TagIDTerminalRuleCall_3_3_0_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getTag0TagCrossReference_3_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Tag0Assignment_3_3_0"


    // $ANTLR start "rule__Feature__Tag1Assignment_3_3_1_1"
    // InternalDomainmodel.g:1192:1: rule__Feature__Tag1Assignment_3_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__Tag1Assignment_3_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1196:1: ( ( ( RULE_ID ) ) )
            // InternalDomainmodel.g:1197:2: ( ( RULE_ID ) )
            {
            // InternalDomainmodel.g:1197:2: ( ( RULE_ID ) )
            // InternalDomainmodel.g:1198:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getTag1TagCrossReference_3_3_1_1_0()); 
            // InternalDomainmodel.g:1199:3: ( RULE_ID )
            // InternalDomainmodel.g:1200:4: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getTag1TagIDTerminalRuleCall_3_3_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getTag1TagIDTerminalRuleCall_3_3_1_1_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getTag1TagCrossReference_3_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Tag1Assignment_3_3_1_1"


    // $ANTLR start "rule__Tag__NameAssignment_1"
    // InternalDomainmodel.g:1211:1: rule__Tag__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Tag__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1215:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:1216:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:1216:2: ( RULE_ID )
            // InternalDomainmodel.g:1217:3: RULE_ID
            {
             before(grammarAccess.getTagAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000C00012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});

}