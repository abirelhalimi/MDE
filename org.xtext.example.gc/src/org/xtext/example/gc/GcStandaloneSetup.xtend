/*
 * generated by Xtext 2.9.2
 */
package org.xtext.example.gc


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class GcStandaloneSetup extends GcStandaloneSetupGenerated {

	def static void doSetup() {
		new GcStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
