/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.mydsl.myDsl.Model

@RunWith(XtextRunner)
@InjectWith(MyDslInjectorProvider)
class MyDslParsingTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Test
	def void integer() {
		val result = parseHelper.parse('''
			10
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	@Test
	def void Sum() {
		val result = parseHelper.parse('''
			(+ 10 10)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void Sum2() {
		val result = parseHelper.parse('''
			(+ 10 10 3 4)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
		def void expt() {
		val result = parseHelper.parse('''
			(expt 2 3)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	@Test
		def void exptComExp() {
		val result = parseHelper.parse('''
			(expt (+ 2 3) 3)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	
	@Test
		def void expressao() {
		val result = parseHelper.parse('''
			(* 4 (+ 5 (- 4 1)))
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	
	@Test
		def void fatIncompleto() {
		val result = parseHelper.parse('''
			(* 3 (factorial (- 4 1)))
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	
	@Test
		def void fatIncompleto2() {
		val result = parseHelper.parse('''
			(* n (factorial (- n 1)))
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
		@Test
		def void predicado() {
		val result = parseHelper.parse('''
			(<= n 2)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
		def void selecao() {
		val result = parseHelper.parse('''
			 (cond ((< n 0) (#f))
			       ((<= n 1) (1))
			         (else (* n (factorial (- n 1)))))
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	
	
		@Test
		def void define() {
		val result = parseHelper.parse('''
		(define factorial (n))
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
		@Test
		def void FATORIAL() {
		val result = parseHelper.parse('''
		(define factorial (n)
		 (cond ((< n 0) (#f))
		         ((<= n 1) (1))
		         (else (* n (factorial (- n 1))))))
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	
}