/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import static org.lwjgl.system.Checks.*;

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
 * <p>Conceptually, this extension splits the state for generic vertex attribute arrays into:</p>
 * 
 * <ul>
 * <li>An array of vertex buffer binding points, each of which specifies:
 * 
 * <ul>
 * <li>a bound buffer object</li>
 * <li>a starting offset for the vertex attribute data in that buffer object</li>
 * <li>a stride used by all attributes using that binding point, and</li>
 * <li>a frequency divisor used by all attributes using that binding point.</li>
 * </ul></li>
 * <li>An array of generic vertex attribute format information records, each of which specifies:
 * 
 * <ul>
 * <li>a reference to one of the new buffer binding points above</li>
 * <li>a component count and format, and a normalization flag for the attribute data, and</li>
 * <li>the offset of the attribute data relative to the base offset of each vertex found at the associated binding point.</li>
 * </ul></li>
 * </ul>
 * 
 * <p>Promoted to core in {@link GL43 OpenGL 4.3}.</p>
 */
public class ARBVertexAttribBinding {

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

	static { GL.initialize(); }

	protected ARBVertexAttribBinding() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps, java.util.Set<String> ext) {
		return checkFunctions(
			caps.glBindVertexBuffer, caps.glVertexAttribFormat, caps.glVertexAttribIFormat, caps.glVertexAttribLFormat, caps.glVertexAttribBinding, 
			caps.glVertexBindingDivisor, ext.contains("GL_EXT_direct_state_access") ? caps.glVertexArrayBindVertexBufferEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glVertexArrayVertexAttribFormatEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glVertexArrayVertexAttribIFormatEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glVertexArrayVertexAttribLFormatEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glVertexArrayVertexAttribBindingEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glVertexArrayVertexBindingDivisorEXT : -1L
		);
	}

	// --- [ glBindVertexBuffer ] ---

	/** Unsafe version of: {@link #glBindVertexBuffer BindVertexBuffer} */
	public static native void nglBindVertexBuffer(int bindingindex, int buffer, long offset, int stride);

	/**
	 * Binds a buffer to a vertex buffer bind point.
	 *
	 * @param bindingindex the index of the vertex buffer binding point to which to bind the buffer
	 * @param buffer       the name of an existing buffer to bind to the vertex buffer binding point
	 * @param offset       the offset of the first element of the buffer
	 * @param stride       the distance between elements within the buffer
	 */
	public static void glBindVertexBuffer(int bindingindex, int buffer, long offset, int stride) {
		nglBindVertexBuffer(bindingindex, buffer, offset, stride);
	}

	// --- [ glVertexAttribFormat ] ---

	/** Unsafe version of: {@link #glVertexAttribFormat VertexAttribFormat} */
	public static native void nglVertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset);

	/**
	 * Specifies the organization of data in vertex arrays.
	 *
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type           the type of the data stored in the array
	 * @param normalized     if true then integer data is normalized to the range [-1, 1] or [0, 1] if it is signed or unsigned, respectively. If false then integer data is
	 *                       directly converted to floating point.
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset) {
		nglVertexAttribFormat(attribindex, size, type, normalized, relativeoffset);
	}

	// --- [ glVertexAttribIFormat ] ---

	/** Unsafe version of: {@link #glVertexAttribIFormat VertexAttribIFormat} */
	public static native void nglVertexAttribIFormat(int attribindex, int size, int type, int relativeoffset);

	/**
	 * Specifies the organization of pure integer data in vertex arrays.
	 *
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type           the type of the data stored in the array
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexAttribIFormat(int attribindex, int size, int type, int relativeoffset) {
		nglVertexAttribIFormat(attribindex, size, type, relativeoffset);
	}

	// --- [ glVertexAttribLFormat ] ---

	/** Unsafe version of: {@link #glVertexAttribLFormat VertexAttribLFormat} */
	public static native void nglVertexAttribLFormat(int attribindex, int size, int type, int relativeoffset);

	/**
	 * Specifies the organization of 64-bit double data in vertex arrays.
	 *
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type           the type of the data stored in the array
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexAttribLFormat(int attribindex, int size, int type, int relativeoffset) {
		nglVertexAttribLFormat(attribindex, size, type, relativeoffset);
	}

	// --- [ glVertexAttribBinding ] ---

	/** Unsafe version of: {@link #glVertexAttribBinding VertexAttribBinding} */
	public static native void nglVertexAttribBinding(int attribindex, int bindingindex);

	/**
	 * Associate a vertex attribute and a vertex buffer binding.
	 *
	 * @param attribindex  the index of the attribute to associate with a vertex buffer binding
	 * @param bindingindex the index of the vertex buffer binding with which to associate the generic vertex attribute
	 */
	public static void glVertexAttribBinding(int attribindex, int bindingindex) {
		nglVertexAttribBinding(attribindex, bindingindex);
	}

	// --- [ glVertexBindingDivisor ] ---

	/** Unsafe version of: {@link #glVertexBindingDivisor VertexBindingDivisor} */
	public static native void nglVertexBindingDivisor(int bindingindex, int divisor);

	/**
	 * Modifies the rate at which generic vertex attributes advance during instanced rendering.
	 *
	 * @param bindingindex the index of the generic vertex attribute
	 * @param divisor      the number of instances that will pass between updates of the generic attribute at slot {@code index}
	 */
	public static void glVertexBindingDivisor(int bindingindex, int divisor) {
		nglVertexBindingDivisor(bindingindex, divisor);
	}

	// --- [ glVertexArrayBindVertexBufferEXT ] ---

	/** Unsafe version of: {@link #glVertexArrayBindVertexBufferEXT VertexArrayBindVertexBufferEXT} */
	public static native void nglVertexArrayBindVertexBufferEXT(int vaobj, int bindingindex, int buffer, long offset, int stride);

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
		nglVertexArrayBindVertexBufferEXT(vaobj, bindingindex, buffer, offset, stride);
	}

	// --- [ glVertexArrayVertexAttribFormatEXT ] ---

	/** Unsafe version of: {@link #glVertexArrayVertexAttribFormatEXT VertexArrayVertexAttribFormatEXT} */
	public static native void nglVertexArrayVertexAttribFormatEXT(int vaobj, int attribindex, int size, int type, boolean normalized, int relativeoffset);

	/**
	 * DSA version of {@link #glVertexAttribFormat VertexAttribFormat}.
	 *
	 * @param vaobj          the vertex array object
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type           the type of the data stored in the array
	 * @param normalized     if true then integer data is normalized to the range [-1, 1] or [0, 1] if it is signed or unsigned, respectively. If false then integer data is
	 *                       directly converted to floating point.
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexArrayVertexAttribFormatEXT(int vaobj, int attribindex, int size, int type, boolean normalized, int relativeoffset) {
		nglVertexArrayVertexAttribFormatEXT(vaobj, attribindex, size, type, normalized, relativeoffset);
	}

	// --- [ glVertexArrayVertexAttribIFormatEXT ] ---

	/** Unsafe version of: {@link #glVertexArrayVertexAttribIFormatEXT VertexArrayVertexAttribIFormatEXT} */
	public static native void nglVertexArrayVertexAttribIFormatEXT(int vaobj, int attribindex, int size, int type, int relativeoffset);

	/**
	 * DSA version of {@link #glVertexAttribIFormat VertexAttribIFormat}.
	 *
	 * @param vaobj          the vertex array object
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type           the type of the data stored in the array
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexArrayVertexAttribIFormatEXT(int vaobj, int attribindex, int size, int type, int relativeoffset) {
		nglVertexArrayVertexAttribIFormatEXT(vaobj, attribindex, size, type, relativeoffset);
	}

	// --- [ glVertexArrayVertexAttribLFormatEXT ] ---

	/** Unsafe version of: {@link #glVertexArrayVertexAttribLFormatEXT VertexArrayVertexAttribLFormatEXT} */
	public static native void nglVertexArrayVertexAttribLFormatEXT(int vaobj, int attribindex, int size, int type, int relativeoffset);

	/**
	 * DSA version of {@link #glVertexAttribLFormat VertexAttribLFormat}.
	 *
	 * @param vaobj          the vertex array object
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type           the type of the data stored in the array
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexArrayVertexAttribLFormatEXT(int vaobj, int attribindex, int size, int type, int relativeoffset) {
		nglVertexArrayVertexAttribLFormatEXT(vaobj, attribindex, size, type, relativeoffset);
	}

	// --- [ glVertexArrayVertexAttribBindingEXT ] ---

	/** Unsafe version of: {@link #glVertexArrayVertexAttribBindingEXT VertexArrayVertexAttribBindingEXT} */
	public static native void nglVertexArrayVertexAttribBindingEXT(int vaobj, int attribindex, int bindingindex);

	/**
	 * DSA version of {@link #glVertexAttribBinding VertexAttribBinding}.
	 *
	 * @param vaobj        the vertex array object
	 * @param attribindex  the index of the attribute to associate with a vertex buffer binding
	 * @param bindingindex the index of the vertex buffer binding with which to associate the generic vertex attribute
	 */
	public static void glVertexArrayVertexAttribBindingEXT(int vaobj, int attribindex, int bindingindex) {
		nglVertexArrayVertexAttribBindingEXT(vaobj, attribindex, bindingindex);
	}

	// --- [ glVertexArrayVertexBindingDivisorEXT ] ---

	/** Unsafe version of: {@link #glVertexArrayVertexBindingDivisorEXT VertexArrayVertexBindingDivisorEXT} */
	public static native void nglVertexArrayVertexBindingDivisorEXT(int vaobj, int bindingindex, int divisor);

	/**
	 * DSA version of {@link #glVertexBindingDivisor VertexBindingDivisor}.
	 *
	 * @param vaobj        the vertex array object
	 * @param bindingindex the index of the generic vertex attribute
	 * @param divisor      the number of instances that will pass between updates of the generic attribute at slot {@code index}
	 */
	public static void glVertexArrayVertexBindingDivisorEXT(int vaobj, int bindingindex, int divisor) {
		nglVertexArrayVertexBindingDivisorEXT(vaobj, bindingindex, divisor);
	}

}