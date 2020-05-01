<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="AlcToDc"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchStatemachine():V"/>
		<constant value="A.__matchState():V"/>
		<constant value="A.__matchTransition():V"/>
		<constant value="__exec__"/>
		<constant value="Statemachine"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyStatemachine(NTransientLink;):V"/>
		<constant value="State"/>
		<constant value="A.__applyState(NTransientLink;):V"/>
		<constant value="Transition"/>
		<constant value="A.__applyTransition(NTransientLink;):V"/>
		<constant value="__matchStatemachine"/>
		<constant value="StateMachine"/>
		<constant value="ALC"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="DC"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="12:3-15:4"/>
		<constant value="__applyStatemachine"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="states"/>
		<constant value="transitions"/>
		<constant value="13:14-13:17"/>
		<constant value="13:14-13:24"/>
		<constant value="13:4-13:24"/>
		<constant value="14:19-14:22"/>
		<constant value="14:19-14:34"/>
		<constant value="14:4-14:34"/>
		<constant value="link"/>
		<constant value="__matchState"/>
		<constant value="Condition"/>
		<constant value="GC"/>
		<constant value="IN1"/>
		<constant value="23:3-30:4"/>
		<constant value="__applyState"/>
		<constant value="4"/>
		<constant value="isActive"/>
		<constant value="Ord"/>
		<constant value="Inh"/>
		<constant value="24:12-24:15"/>
		<constant value="24:12-24:20"/>
		<constant value="24:4-24:20"/>
		<constant value="25:16-25:19"/>
		<constant value="25:16-25:28"/>
		<constant value="25:4-25:28"/>
		<constant value="26:11-26:14"/>
		<constant value="26:11-26:18"/>
		<constant value="26:4-26:18"/>
		<constant value="27:11-27:14"/>
		<constant value="27:11-27:18"/>
		<constant value="27:4-27:18"/>
		<constant value="__matchTransition"/>
		<constant value="36:3-40:4"/>
		<constant value="__applyTransition"/>
		<constant value="event"/>
		<constant value="source"/>
		<constant value="target"/>
		<constant value="37:13-37:16"/>
		<constant value="37:13-37:22"/>
		<constant value="37:4-37:22"/>
		<constant value="38:14-38:17"/>
		<constant value="38:14-38:24"/>
		<constant value="38:4-38:24"/>
		<constant value="39:14-39:17"/>
		<constant value="39:14-39:24"/>
		<constant value="39:4-39:24"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
			<getasm/>
			<pcall arg="41"/>
			<getasm/>
			<pcall arg="42"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="5"/>
		</localvariabletable>
	</operation>
	<operation name="43">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="44"/>
			<call arg="45"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="46"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="47"/>
			<call arg="45"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="48"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="49"/>
			<call arg="45"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="50"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="1" name="33" begin="25" end="28"/>
			<lve slot="0" name="17" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="51">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="52"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="44"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="53"/>
			<load arg="19"/>
			<pcall arg="58"/>
			<dup/>
			<push arg="59"/>
			<push arg="52"/>
			<push arg="59"/>
			<new/>
			<pcall arg="60"/>
			<pusht/>
			<pcall arg="61"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="62" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="53" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="63">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="64"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="53"/>
			<call arg="65"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="59"/>
			<call arg="66"/>
			<store arg="67"/>
			<load arg="67"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="68"/>
			<call arg="30"/>
			<set arg="68"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="69"/>
			<call arg="30"/>
			<set arg="69"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="70" begin="11" end="11"/>
			<lne id="71" begin="11" end="12"/>
			<lne id="72" begin="9" end="14"/>
			<lne id="73" begin="17" end="17"/>
			<lne id="74" begin="17" end="18"/>
			<lne id="75" begin="15" end="20"/>
			<lne id="62" begin="8" end="21"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="59" begin="7" end="21"/>
			<lve slot="2" name="53" begin="3" end="21"/>
			<lve slot="0" name="17" begin="0" end="21"/>
			<lve slot="1" name="76" begin="0" end="21"/>
		</localvariabletable>
	</operation>
	<operation name="77">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="47"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="19"/>
			<push arg="78"/>
			<push arg="79"/>
			<findme/>
			<push arg="80"/>
			<call arg="55"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="47"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="53"/>
			<load arg="19"/>
			<pcall arg="58"/>
			<dup/>
			<push arg="79"/>
			<load arg="29"/>
			<pcall arg="58"/>
			<dup/>
			<push arg="59"/>
			<push arg="47"/>
			<push arg="59"/>
			<new/>
			<pcall arg="60"/>
			<pusht/>
			<pcall arg="61"/>
			<enditerate/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="81" begin="30" end="35"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="53" begin="6" end="37"/>
			<lve slot="2" name="79" begin="13" end="38"/>
			<lve slot="0" name="17" begin="0" end="39"/>
		</localvariabletable>
	</operation>
	<operation name="82">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="64"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="53"/>
			<call arg="65"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="79"/>
			<call arg="65"/>
			<store arg="67"/>
			<load arg="19"/>
			<push arg="59"/>
			<call arg="66"/>
			<store arg="83"/>
			<load arg="83"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="84"/>
			<call arg="30"/>
			<set arg="84"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="85"/>
			<call arg="30"/>
			<set arg="85"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="86"/>
			<call arg="30"/>
			<set arg="86"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="87" begin="15" end="15"/>
			<lne id="88" begin="15" end="16"/>
			<lne id="89" begin="13" end="18"/>
			<lne id="90" begin="21" end="21"/>
			<lne id="91" begin="21" end="22"/>
			<lne id="92" begin="19" end="24"/>
			<lne id="93" begin="27" end="27"/>
			<lne id="94" begin="27" end="28"/>
			<lne id="95" begin="25" end="30"/>
			<lne id="96" begin="33" end="33"/>
			<lne id="97" begin="33" end="34"/>
			<lne id="98" begin="31" end="36"/>
			<lne id="81" begin="12" end="37"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="59" begin="11" end="37"/>
			<lve slot="2" name="53" begin="3" end="37"/>
			<lve slot="3" name="79" begin="7" end="37"/>
			<lve slot="0" name="17" begin="0" end="37"/>
			<lve slot="1" name="76" begin="0" end="37"/>
		</localvariabletable>
	</operation>
	<operation name="99">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="49"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="49"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="53"/>
			<load arg="19"/>
			<pcall arg="58"/>
			<dup/>
			<push arg="59"/>
			<push arg="49"/>
			<push arg="59"/>
			<new/>
			<pcall arg="60"/>
			<pusht/>
			<pcall arg="61"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="100" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="53" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="101">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="64"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="53"/>
			<call arg="65"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="59"/>
			<call arg="66"/>
			<store arg="67"/>
			<load arg="67"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="102"/>
			<call arg="30"/>
			<set arg="102"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="103"/>
			<call arg="30"/>
			<set arg="103"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="104"/>
			<call arg="30"/>
			<set arg="104"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="105" begin="11" end="11"/>
			<lne id="106" begin="11" end="12"/>
			<lne id="107" begin="9" end="14"/>
			<lne id="108" begin="17" end="17"/>
			<lne id="109" begin="17" end="18"/>
			<lne id="110" begin="15" end="20"/>
			<lne id="111" begin="23" end="23"/>
			<lne id="112" begin="23" end="24"/>
			<lne id="113" begin="21" end="26"/>
			<lne id="100" begin="8" end="27"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="59" begin="7" end="27"/>
			<lve slot="2" name="53" begin="3" end="27"/>
			<lve slot="0" name="17" begin="0" end="27"/>
			<lve slot="1" name="76" begin="0" end="27"/>
		</localvariabletable>
	</operation>
</asm>
