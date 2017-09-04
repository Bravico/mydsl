package org.example.domainmodel.generator


import java.text.SimpleDateFormat
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.google.inject.Inject
import org.example.domainmodel.domainmodel.blog
import org.example.domainmodel.domainmodel.articles
import java.util.Date

class DomainmodelGenerator implements IGenerator2 {
 
    @Inject extension IQualifiedNameProvider
    String tagStr="";
    String date="";
    
    
	/**
	 * a better way to deal with generated file is that we search element in Type, 
	 * and use instanceof to judge it is blog or articles
	 */
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
        for (b : input.allContents.toIterable.filter(blog)) {
        	if(b.feature.date!=null) date = b.feature.date
//        	else date = new Date().toString()
            fsa.generateFile(
                date + '-'+ b.feature.name + ".md",
                b.compile)
        }
        for (a : input.allContents.toIterable.filter(articles)) {
            fsa.generateFile(
            	date + '-'+ a.feature.name+ ".md",
                a.compile)
        }
    }
     //«new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.XXX").format(b.feature.date.toString())» 
    def compile(blog b) ''' 
    	---
    	layout: post
    	title: "«FOR s : b.feature.name.toString().split("-")»«IF b.feature.name.toString().split("-").get((b.feature.name.toString().split("-").length)-1).equals(s)»«s.toFirstUpper»«ELSE»«s.toFirstUpper» «ENDIF»«ENDFOR»"
    	categories: «b.fullyQualifiedName»
    	excerpt:
    	tags: [«FOR t : b.feature.tag0»«t.name»«ENDFOR»«FOR t : b.feature.tag1»,«t.name»«ENDFOR»] 
    	image:
    	feature: 
    	date: «b.feature.date.formate»
    	modified:
    	---
    '''
	/*
	 * formate date 
	 */
	def formate(String date) {
		if (date!=null){
			//date is not null, use the date in file
			tagStr = date + new SimpleDateFormat("'T'HH:mm:ssXXX").format(new Date()).toString()
		}else{
			//date is null,create current time instead
			tagStr = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(new Date()) 
		}
	}
	
    

    
    
  
    //«new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.XXX").format(a.feature.date)»
    def compile(articles a) '''
         ---
         layout: post
         title: "«FOR s : a.feature.name.toString().split("-")»«IF a.feature.name.toString().split("-").get((a.feature.name.toString().split("-").length)-1).equals(s)»«s.toFirstUpper»«ELSE»«s.toFirstUpper» «ENDIF»«ENDFOR»"
         categories: «a.fullyQualifiedName»
         excerpt:
         tags:[«FOR t : a.feature.tag0»«t.name»«ENDFOR»«FOR t : a.feature.tag1»,«t.name»«ENDFOR»]
         image:
         feature: 
         date: «a.feature.date.formate»
         modified:
         ---
    '''
				
	override afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
//	"«FOR s : a.feature.name.toString().split("-")»«s.toFirstUpper»«ENDFOR»"
	

	
}