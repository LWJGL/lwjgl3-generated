/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/vertex_attrib_binding.txt">ARB_vertex_attrib_binding</a> extension.
 * 
 * <p>OpenGL currently supports (at least) 16 vertex attributes and 16 vertex buffer bindings, with a fixed mapping between vertex attributes and vertex
 * buffer bindings. This extension allows the application to change the mapping between attributes and bindings, which can make it more efficient to update
 * vertex buffer bindings for interleaved vertex formats where many attributes share the same buffer.</p>
 * 
 * <p>This extension also separates the vertex binding update from the vertex attribute format update, which saves applications the effort of redundantly
 * specifying the same format state over and over.</p>
 * 
 * <p>Conceptually, this extension splits the state for generic vertex attribute arrays into:
 * <ul>
 * <li>An array of vertex buffer binding points, each of which specifies:
 * <ul>
 * <li>a bound buffer object</li>
 * <li>a starting offset for the vertex attribute data in that buffer object</li>
 * <li>a stride used by all attributes using that binding point, and</li>
 * <li>a frequency divisor used by all attributes using that binding point.</li>
 * </ul></li>
 * <li>An array of generic vertex attribute format information records, each of which specifies:
 * <ul>
 * <li>a reference to one of the new buffer binding points above</li>
 * <li>a component count and format, and a normalization flag for the attribute data, and</li>
 * <li>the offset of the attribute data relative to the base offset of each vertex found at the associated binding point.</li>
 * </ul></li>
 * </ul>
 * Promoted to core in {@link GL43 OpenGL 4.3}.</p>
 */
public final class ARBVertexAttribBinding {

	/** Accepted by the {@code pname} parameter of GetVertexAttrib*v. */
	public static final int
		GL_VERTEX_ATTRIB_BINDING         = 0x82D4,
		GL_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D5;

	/** Accepted by the {@code target} parameter of GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, and GetInteger64i_v. */
	public static final int
		GL_VERTEX_BINDING_DIVISOR = 0x82D6,
		GL_VERTEX_BINDING_OFFSET  = 0x82D7,
		GL_VERTEX_BINDING_STRIDE  = 0x82D8,
		GL_VERTEX_BINDING_BUFFER  = 0x8F4F;

	/** Accepted by the {@code pname} parameter of GetIntegerv, .... */
	public static final int
		GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D9,
		GL_MAX_VERTEX_ATTRIB_BINDINGS        = 0x82DA;

	/** Function address. */
	@JavadocExclude
	public final long
		BindVertexBuffer,
		VertexAttribFormat,
		VertexAttribIFormat,
		VertexAttribLFormat,
		VertexAttribBinding,
		VertexBindingDivisor,
		VertexArrayBindVertexBufferEXT,
		VertexArrayVertexAttribFormatEXT,
		VertexArrayVertexAttribIFormatEXT,
		VertexArrayVertexAttribLFormatEXT,
		VertexArrayVertexAttribBindingEXT,
		VertexArrayVertexBindingDivisorEXT;

	@JavadocExclude
	public ARBVertexAttribBinding(FunctionProvider provider) {
		BindVertexBuffer = provider.getFunctionAddress("glBindVertexBuffer");
		VertexAttribFormat = provider.getFunctionAddress("glVertexAttribFormat");
		VertexAttribIFormat = provider.getFunctionAddress("glVertexAttribIFormat");
		VertexAttribLFormat = provider.getFunctionAddress("glVertexAttribLFormat");
		VertexAttribBinding = provider.getFunctionAddress("glVertexAttribBinding");
		VertexBindingDivisor = provider.getFunctionAddress("glVertexBindingDivisor");
		VertexArrayBindVertexBufferEXT = provider.getFunctionAddress("glVertexArrayBindVertexBufferEXT");
		VertexArrayVertexAttribFormatEXT = provider.getFunctionAddress("glVertexArrayVertexAttribFormatEXT");
		VertexArrayVertexAttribIFormatEXT = provider.getFunctionAddress("glVertexArrayVertexAttribIFormatEXT");
		VertexArrayVertexAttribLFormatEXT = provider.getFunctionAddress("glVertexArrayVertexAttribLFormatEXT");
		VertexArrayVertexAttribBindingEXT = provider.getFunctionAddress("glVertexArrayVertexAttribBindingEXT");
		VertexArrayVertexBindingDivisorEXT = provider.getFunctionAddress("glVertexArrayVertexBindingDivisorEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBVertexAttribBinding} instance for the current context. */
	public static ARBVertexAttribBinding getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBVertexAttribBinding);
	}

	static ARBVertexAttribBinding create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_vertex_attrib_binding") ) return null;

		ARBVertexAttribBinding funcs = new ARBVertexAttribBinding(provider);

		boolean supported = checkFunctions(
			funcs.BindVertexBuffer, funcs.VertexAttribFormat, funcs.VertexAttribIFormat, funcs.VertexAttribLFormat, funcs.VertexAttribBinding, 
			funcs.VertexBindingDivisor, ext.contains("GL_EXT_direct_state_access") ? funcs.VertexArrayBindVertexBufferEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.VertexArrayVertexAttribFormatEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.VertexArrayVertexAttribIFormatEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.VertexArrayVertexAttribLFormatEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.VertexArrayVertexAttribBindingEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.VertexArrayVertexBindingDivisorEXT : -1L
		);

		return GL.checkExtension("GL_ARB_vertex_attrib_binding", funcs, supported);
	}

	// --- [ glBindVertexBuffer ] ---

	/**
	 * Binds a buffer to a vertex buffer bind point.
	 *
	 * @param bindingindex the index of the vertex buffer binding point to which to bind the buffer
	 * @param buffer       the name of an existing buffer to bind to the vertex buffer binding point
	 * @param offset       the offset of the first element of the buffer
	 * @param stride       the distance between elements within the buffer
	 */
	public static void glBindVertexBuffer(int bindingindex, int buffer, long offset, int stride) {
		long __functionAddress = getInstance().BindVertexBuffer;
		callIIPIV(__functionAddress, bindingindex, buffer, offset, stride);
	}

	// --- [ glVertexAttribFormat ] ---

	/**
	 * Specifies the organization of data in vertex arrays.
	 *
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. One of:<br>1, 2, 3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type           the type of the data stored in the array
	 * @param normalized     if true then integer data is normalized to the range [-1, 1] or [0, 1] if it is signed or unsigned, respectively. If false then integer data is
	 *                       directly converted to floating point.
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset) {
		long __functionAddress = getInstance().VertexAttribFormat;
		callIIIZIV(__functionAddress, attribindex, size, type, normalized, relativeoffset);
	}

	// --- [ glVertexAttribIFormat ] ---

	/**
	 * Specifies the organization of pure integer data in vertex arrays.
	 *
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. One of:<br>1, 2, 3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type           the type of the data stored in the array
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexAttribIFormat(int attribindex, int size, int type, int relativeoffset) {
		long __functionAddress = getInstance().VertexAttribIFormat;
		callIIIIV(__functionAddress, attribindex, size, type, relativeoffset);
	}

	// --- [ glVertexAttribLFormat ] ---

	/**
	 * Specifies the organization of 64-bit double data in vertex arrays.
	 *
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. One of:<br>1, 2, 3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type           the type of the data stored in the array
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexAttribLFormat(int attribindex, int size, int type, int relativeoffset) {
		long __functionAddress = getInstance().VertexAttribLFormat;
		callIIIIV(__functionAddress, attribindex, size, type, relativeoffset);
	}

	// --- [ glVertexAttribBinding ] ---

	/**
	 * Associate a vertex attribute and a vertex buffer binding.
	 *
	 * @param attribindex  the index of the attribute to associate with a vertex buffer binding
	 * @param bindingindex the index of the vertex buffer binding with which to associate the generic vertex attribute
	 */
	public static void glVertexAttribBinding(int attribindex, int bindingindex) {
		long __functionAddress = getInstance().VertexAttribBinding;
		callIIV(__functionAddress, attribindex, bindingindex);
	}

	// --- [ glVertexBindingDivisor ] ---

	/**
	 * Modifies the rate at which generic vertex attributes advance during instanced rendering.
	 *
	 * @param bindingindex the index of the generic vertex attribute
	 * @param divisor      the number of instances that will pass between updates of the generic attribute at slot {@code index}
	 */
	public static void glVertexBindingDivisor(int bindingindex, int divisor) {
		long __functionAddress = getInstance().VertexBindingDivisor;
		callIIV(__functionAddress, bindingindex, divisor);
	}

	// --- [ glVertexArrayBindVertexBufferEXT ] ---

	/**
	 * DSA version of {@link #glBindVertexBuffer BindVertexBuffer}.
	 *
	 * @param vaobj        the vertex array object
	 * @param bindingindex the index of the vertex buffer binding point to which to bind the buffer
	 * @param buffer       the name of an existing buffer to bind to the vertex buffer binding point
	 * @param offset       the offset of the first element of the buffer
	 * @param stride       the distance between elements within the buffer
	 */
	public static void glVertexArrayBindVertexBufferEXT(int vaobj, int bindingindex, int buffer, long offset, int stride) {
		long __functionAddress = getInstance().VertexArrayBindVertexBufferEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPIV(__functionAddress, vaobj, bindingindex, buffer, offset, stride);
	}

	// --- [ glVertexArrayVertexAttribFormatEXT ] ---

	/**
	 * DSA version of {@link #glVertexAttribFormat VertexAttribFormat}.
	 *
	 * @param vaobj          the vertex array object
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. One of:<br>1, 2, 3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type           the type of the data stored in the array
	 * @param normalized     if true then integer data is normalized to the range [-1, 1] or [0, 1] if it is signed or unsigned, respectively. If false then integer data is
	 *                       directly converted to floating point.
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexArrayVertexAttribFormatEXT(int vaobj, int attribindex, int size, int type, boolean normalized, int relativeoffset) {
		long __functionAddress = getInstance().VertexArrayVertexAttribFormatEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIZIV(__functionAddress, vaobj, attribindex, size, type, normalized, relativeoffset);
	}

	// --- [ glVertexArrayVertexAttribIFormatEXT ] ---

	/**
	 * DSA version of {@link #glVertexAttribIFormat VertexAttribIFormat}.
	 *
	 * @param vaobj          the vertex array object
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. One of:<br>1, 2, 3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type           the type of the data stored in the array
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexArrayVertexAttribIFormatEXT(int vaobj, int attribindex, int size, int type, int relativeoffset) {
		long __functionAddress = getInstance().VertexArrayVertexAttribIFormatEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIV(__functionAddress, vaobj, attribindex, size, type, relativeoffset);
	}

	// --- [ glVertexArrayVertexAttribLFormatEXT ] ---

	/**
	 * DSA version of {@link #glVertexAttribLFormat VertexAttribLFormat}.
	 *
	 * @param vaobj          the vertex array object
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. One of:<br>1, 2, 3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type           the type of the data stored in the array
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexArrayVertexAttribLFormatEXT(int vaobj, int attribindex, int size, int type, int relativeoffset) {
		long __functionAddress = getInstance().VertexArrayVertexAttribLFormatEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIIV(__functionAddress, vaobj, attribindex, size, type, relativeoffset);
	}

	// --- [ glVertexArrayVertexAttribBindingEXT ] ---

	/**
	 * DSA version of {@link #glVertexAttribBinding VertexAttribBinding}.
	 *
	 * @param vaobj        the vertex array object
	 * @param attribindex  the index of the attribute to associate with a vertex buffer binding
	 * @param bindingindex the index of the vertex buffer binding with which to associate the generic vertex attribute
	 */
	public static void glVertexArrayVertexAttribBindingEXT(int vaobj, int attribindex, int bindingindex) {
		long __functionAddress = getInstance().VertexArrayVertexAttribBindingEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIV(__functionAddress, vaobj, attribindex, bindingindex);
	}

	// --- [ glVertexArrayVertexBindingDivisorEXT ] ---

	/**
	 * DSA version of {@link #glVertexBindingDivisor VertexBindingDivisor}.
	 *
	 * @param vaobj        the vertex array object
	 * @param bindingindex the index of the generic vertex attribute
	 * @param divisor      the number of instances that will pass between updates of the generic attribute at slot {@code index}
	 */
	public static void glVertexArrayVertexBindingDivisorEXT(int vaobj, int bindingindex, int divisor) {
		long __functionAddress = getInstance().VertexArrayVertexBindingDivisorEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIV(__functionAddress, vaobj, bindingindex, divisor);
	}

}