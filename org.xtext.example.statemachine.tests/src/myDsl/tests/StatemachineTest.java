/**
 */
package myDsl.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import myDsl.MyDslFactory;
import myDsl.Statemachine;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Statemachine</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatemachineTest extends TestCase {

	/**
	 * The fixture for this Statemachine test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Statemachine fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StatemachineTest.class);
	}

	/**
	 * Constructs a new Statemachine test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatemachineTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Statemachine test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Statemachine fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Statemachine test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Statemachine getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MyDslFactory.eINSTANCE.createStatemachine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //StatemachineTest
