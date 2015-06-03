/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/command_list.txt">NV_command_list</a> extension.
 * 
 * <p>This extension adds a few new features designed to provide very low overhead batching and replay of rendering commands and state changes:
 * <ul>
 * <li>A state object, which stores a pre-validated representation of the the state of (almost) the entire pipeline.</li>
 * <li>A more flexible and extensible MultiDrawIndirect (MDI) type of mechanism, using a token-based command stream, allowing to setup binding state and
 * emit draw calls.</li>
 * <li>A set of functions to execute a list of the token-based command streams with state object changes interleaved with the streams.</li>
 * <li>Command lists enabling compilation and reuse of sequences of command streams and state object changes.</li>
 * </ul></p>
 * 
 * <p>Because state objects reflect the state of the entire pipeline, it is expected that they can be pre-validated and executed efficiently. It is also
 * expected that when state objects are combined into a command list, the command list can diff consecutive state objects to produce a reduced/ optimized
 * set of state changes specific to that transition.</p>
 * 
 * <p>The token-based command stream can also be stored in regular buffer objects and therefore be modified by the server itself. This allows more complex
 * work creation than the original MDI approach, which was limited to emitting draw calls only.</p>
 * 
 * <h3>Command structures</h3>
 * <pre><code style="font-family: monospace">
 * typedef struct {
 *   uint  header;
 * } TerminateSequenceCommandNV;
 * 
 * typedef struct {
 *   uint  header;
 * } NOPCommandNV;
 * 
 * typedef  struct {
 *   uint  header;
 *   uint  count;
 *   uint  firstIndex;
 *   uint  baseVertex;
 * } DrawElementsCommandNV;
 * 
 * typedef  struct {
 *   uint  header;
 *   uint  count;
 *   uint  first;
 * } DrawArraysCommandNV;
 * 
 * typedef  struct {
 *   uint  header;
 *   uint  mode;
 *   uint  count;
 *   uint  instanceCount;
 *   uint  firstIndex;
 *   uint  baseVertex;
 *   uint  baseInstance;
 * } DrawElementsInstancedCommandNV;
 * 
 * typedef  struct {
 *   uint  header;
 *   uint  mode;
 *   uint  count;
 *   uint  instanceCount;
 *   uint  first;
 *   uint  baseInstance;
 * } DrawArraysInstancedCommandNV;
 * 
 * typedef struct {
 *   uint  header;
 *   uint  addressLo;
 *   uint  addressHi;
 *   uint  typeSizeInByte;
 * } ElementAddressCommandNV;
 * 
 * typedef struct {
 *   uint  header;
 *   uint  index;
 *   uint  addressLo;
 *   uint  addressHi;
 * } AttributeAddressCommandNV;
 * 
 * typedef struct {
 *   uint    header;
 *   ushort  index;
 *   ushort  stage;
 *   uint    addressLo;
 *   uint    addressHi;
 * } UniformAddressCommandNV;
 * 
 * typedef struct {
 *   uint  header;
 *   float red;
 *   float green;
 *   float blue;
 *   float alpha;
 * } BlendColorCommandNV;
 * 
 * typedef struct {
 *   uint  header;
 *   uint  frontStencilRef;
 *   uint  backStencilRef;
 * } StencilRefCommandNV;
 * 
 * typedef struct {
 *   uint  header;
 *   float lineWidth;
 * } LineWidthCommandNV;
 * 
 * typedef struct {
 *   uint  header;
 *   float scale;
 *   float bias;
 * } PolygonOffsetCommandNV;
 * 
 * typedef struct {
 *   uint  header;
 *   float alphaRef;
 * } AlphaRefCommandNV;
 * 
 * typedef struct {
 *   uint  header;
 *   uint  x;
 *   uint  y;
 *   uint  width;
 *   uint  height;
 * } ViewportCommandNV; // only ViewportIndex 0
 * 
 * typedef struct {
 *   uint  header;
 *   uint  x;
 *   uint  y;
 *   uint  width;
 *   uint  height;
 * } ScissorCommandNV; // only ViewportIndex 0
 * 
 * typedef struct {
 *   uint  header;
 *   uint  frontFace; // 0 for CW, 1 for CCW
 * } FrontFaceCommandNV;</code></pre>
 * 
 * <p>Tight packing is used for all structures.</p>
 */
public final class NVCommandList {

	/** Used in DrawCommandsStates buffer formats, in GetCommandHeaderNV to return the header. */
	public static final int
		GL_TERMINATE_SEQUENCE_COMMAND_NV      = 0x0,
		GL_NOP_COMMAND_NV                     = 0x1,
		GL_DRAW_ELEMENTS_COMMAND_NV           = 0x2,
		GL_DRAW_ARRAYS_COMMAND_NV             = 0x3,
		GL_DRAW_ELEMENTS_STRIP_COMMAND_NV     = 0x4,
		GL_DRAW_ARRAYS_STRIP_COMMAND_NV       = 0x5,
		GL_DRAW_ELEMENTS_INSTANCED_COMMAND_NV = 0x6,
		GL_DRAW_ARRAYS_INSTANCED_COMMAND_NV   = 0x7,
		GL_ELEMENT_ADDRESS_COMMAND_NV         = 0x8,
		GL_ATTRIBUTE_ADDRESS_COMMAND_NV       = 0x9,
		GL_UNIFORM_ADDRESS_COMMAND_NV         = 0xA,
		GL_BLEND_COLOR_COMMAND_NV             = 0xB,
		GL_STENCIL_REF_COMMAND_NV             = 0xC,
		GL_LINE_WIDTH_COMMAND_NV              = 0xD,
		GL_POLYGON_OFFSET_COMMAND_NV          = 0xE,
		GL_ALPHA_REF_COMMAND_NV               = 0xF,
		GL_VIEWPORT_COMMAND_NV                = 0x10,
		GL_SCISSOR_COMMAND_NV                 = 0x11,
		GL_FRONT_FACE_COMMAND_NV              = 0x12;

	/** Function address. */
	@JavadocExclude
	public final long
		CreateStatesNV,
		DeleteStatesNV,
		IsStateNV,
		StateCaptureNV,
		GetCommandHeaderNV,
		GetStageIndexNV,
		DrawCommandsNV,
		DrawCommandsAddressNV,
		DrawCommandsStatesNV,
		DrawCommandsStatesAddressNV,
		CreateCommandListsNV,
		DeleteCommandListsNV,
		IsCommandListNV,
		ListDrawCommandsStatesClientNV,
		CommandListSegmentsNV,
		CompileCommandListNV,
		CallCommandListNV;

	@JavadocExclude
	public NVCommandList(FunctionProvider provider) {
		CreateStatesNV = provider.getFunctionAddress("glCreateStatesNV");
		DeleteStatesNV = provider.getFunctionAddress("glDeleteStatesNV");
		IsStateNV = provider.getFunctionAddress("glIsStateNV");
		StateCaptureNV = provider.getFunctionAddress("glStateCaptureNV");
		GetCommandHeaderNV = provider.getFunctionAddress("glGetCommandHeaderNV");
		GetStageIndexNV = provider.getFunctionAddress("glGetStageIndexNV");
		DrawCommandsNV = provider.getFunctionAddress("glDrawCommandsNV");
		DrawCommandsAddressNV = provider.getFunctionAddress("glDrawCommandsAddressNV");
		DrawCommandsStatesNV = provider.getFunctionAddress("glDrawCommandsStatesNV");
		DrawCommandsStatesAddressNV = provider.getFunctionAddress("glDrawCommandsStatesAddressNV");
		CreateCommandListsNV = provider.getFunctionAddress("glCreateCommandListsNV");
		DeleteCommandListsNV = provider.getFunctionAddress("glDeleteCommandListsNV");
		IsCommandListNV = provider.getFunctionAddress("glIsCommandListNV");
		ListDrawCommandsStatesClientNV = provider.getFunctionAddress("glListDrawCommandsStatesClientNV");
		CommandListSegmentsNV = provider.getFunctionAddress("glCommandListSegmentsNV");
		CompileCommandListNV = provider.getFunctionAddress("glCompileCommandListNV");
		CallCommandListNV = provider.getFunctionAddress("glCallCommandListNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVCommandList} instance for the current context. */
	public static NVCommandList getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVCommandList);
	}

	static NVCommandList create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_command_list") ) return null;

		NVCommandList funcs = new NVCommandList(provider);

		boolean supported = checkFunctions(
			funcs.CreateStatesNV, funcs.DeleteStatesNV, funcs.IsStateNV, funcs.StateCaptureNV, funcs.GetCommandHeaderNV, funcs.GetStageIndexNV, 
			funcs.DrawCommandsNV, funcs.DrawCommandsAddressNV, funcs.DrawCommandsStatesNV, funcs.DrawCommandsStatesAddressNV, funcs.CreateCommandListsNV, 
			funcs.DeleteCommandListsNV, funcs.IsCommandListNV, funcs.ListDrawCommandsStatesClientNV, funcs.CommandListSegmentsNV, funcs.CompileCommandListNV, 
			funcs.CallCommandListNV
		);

		return GL.checkExtension("GL_NV_command_list", funcs, supported);
	}

	// --- [ glCreateStatesNV ] ---

	/** JNI method for {@link #glCreateStatesNV CreateStatesNV} */
	@JavadocExclude
	public static native void nglCreateStatesNV(int n, long states, long __functionAddress);

	/** Unsafe version of {@link #glCreateStatesNV CreateStatesNV} */
	@JavadocExclude
	public static void nglCreateStatesNV(int n, long states) {
		long __functionAddress = getInstance().CreateStatesNV;
		nglCreateStatesNV(n, states, __functionAddress);
	}

	/**
	 * Returns <code>n</code> previously unused state object names in <code>states</code>, and creates a state object in the initial state for each name.
	 *
	 * @param n      the number of state object names to create
	 * @param states the buffer in which to write the created state object names
	 */
	public static void glCreateStatesNV(int n, ByteBuffer states) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(states, n << 2);
		nglCreateStatesNV(n, memAddress(states));
	}

	/** Alternative version of: {@link #glCreateStatesNV CreateStatesNV} */
	public static void glCreateStatesNV(IntBuffer states) {
		nglCreateStatesNV(states.remaining(), memAddress(states));
	}

	/** Single return value version of: {@link #glCreateStatesNV CreateStatesNV} */
	public static int glCreateStatesNV() {
		APIBuffer __buffer = apiBuffer();
		int states = __buffer.intParam();
		nglCreateStatesNV(1, __buffer.address(states));
		return __buffer.intValue(states);
	}

	// --- [ glDeleteStatesNV ] ---

	/** JNI method for {@link #glDeleteStatesNV DeleteStatesNV} */
	@JavadocExclude
	public static native void nglDeleteStatesNV(int n, long states, long __functionAddress);

	/** Unsafe version of {@link #glDeleteStatesNV DeleteStatesNV} */
	@JavadocExclude
	public static void nglDeleteStatesNV(int n, long states) {
		long __functionAddress = getInstance().DeleteStatesNV;
		nglDeleteStatesNV(n, states, __functionAddress);
	}

	/**
	 * Deletes <code>n</code> names of state objects given by <code>states</code>. Once a state object is deleted it has no contents and its name is again
	 * unused. Unused names in <code>states</code> are silently ignored, as is the value zero.
	 *
	 * @param n      the number of state object names to delete
	 * @param states the buffer from which to read the state object names to delete
	 */
	public static void glDeleteStatesNV(int n, ByteBuffer states) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(states, n << 2);
		nglDeleteStatesNV(n, memAddress(states));
	}

	/** Alternative version of: {@link #glDeleteStatesNV DeleteStatesNV} */
	public static void glDeleteStatesNV(IntBuffer states) {
		nglDeleteStatesNV(states.remaining(), memAddress(states));
	}

	/** Single value version of: {@link #glDeleteStatesNV DeleteStatesNV} */
	public static void glDeleteStatesNV(int state) {
		APIBuffer __buffer = apiBuffer();
		int states = __buffer.intParam(state);
		nglDeleteStatesNV(1, __buffer.address(states));
	}

	// --- [ glIsStateNV ] ---

	/** JNI method for {@link #glIsStateNV IsStateNV} */
	@JavadocExclude
	public static native boolean nglIsStateNV(int state, long __functionAddress);

	/**
	 * Returns true if the specified name corresponds to a state object.
	 *
	 * @param state the object name to test
	 */
	public static boolean glIsStateNV(int state) {
		long __functionAddress = getInstance().IsStateNV;
		return nglIsStateNV(state, __functionAddress);
	}

	// --- [ glStateCaptureNV ] ---

	/** JNI method for {@link #glStateCaptureNV StateCaptureNV} */
	@JavadocExclude
	public static native void nglStateCaptureNV(int state, int mode, long __functionAddress);

	/**
	 * Captures the current state of the rendering pipeline into the object indicated by <code>state</code>.
	 * 
	 * <p>The captured rendering state includes:
	 * <ul>
	 * <li>Vertex attribute enable state, formats, types, relative offsets and strides, but not bound vertex buffers or vertex unified addresses, nor their
	 * offsets, nor bound index buffers/addresses.</li>
	 * <li>Primitive state such as primitive restart and patch parameters, provoking vertex.</li>
	 * <li>Immediate vertex attribute values as provided by glVertexAttrib* or glVertexAttribI*</li>
	 * <li>All active program binaries except compute (either from the active program pipeline or from UseProgram) with their current subroutine configuration
	 * excluding all default-block uniform values.</li>
	 * <li>Rasterization, multisample fragment operation, depth, stencil, and blending state.</li>
	 * <li>Rasterization state such as line widths, stippling, polygon modes and offsets.</li>
	 * <li>Viewport, scissor, and depth range state.</li>
	 * <li>Framebuffer attachment configuration: attachment state including attachment formats, drawbuffer state, and target/layer information, but not
	 * including actual attachments or sizes of attachments (these are stored separately).</li>
	 * <li>Framebuffer attachment textures (but not residency state).</li>
	 * </ul></p>
	 *
	 * @param state the state object into which to capture the current rendering state
	 * @param mode  the basic Begin mode that this state object must be used with. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 */
	public static void glStateCaptureNV(int state, int mode) {
		long __functionAddress = getInstance().StateCaptureNV;
		nglStateCaptureNV(state, mode, __functionAddress);
	}

	// --- [ glGetCommandHeaderNV ] ---

	/** JNI method for {@link #glGetCommandHeaderNV GetCommandHeaderNV} */
	@JavadocExclude
	public static native int nglGetCommandHeaderNV(int tokenID, int size, long __functionAddress);

	/**
	 * Returns the encoded 32bit header value for a given command; the returned value is implementation specific.
	 *
	 * @param tokenID the command to query. One of:<br>{@link #GL_TERMINATE_SEQUENCE_COMMAND_NV TERMINATE_SEQUENCE_COMMAND_NV}, {@link #GL_NOP_COMMAND_NV NOP_COMMAND_NV}, {@link #GL_DRAW_ELEMENTS_COMMAND_NV DRAW_ELEMENTS_COMMAND_NV}, {@link #GL_DRAW_ARRAYS_COMMAND_NV DRAW_ARRAYS_COMMAND_NV}, {@link #GL_DRAW_ELEMENTS_STRIP_COMMAND_NV DRAW_ELEMENTS_STRIP_COMMAND_NV}, {@link #GL_DRAW_ARRAYS_STRIP_COMMAND_NV DRAW_ARRAYS_STRIP_COMMAND_NV}, {@link #GL_DRAW_ELEMENTS_INSTANCED_COMMAND_NV DRAW_ELEMENTS_INSTANCED_COMMAND_NV}, {@link #GL_DRAW_ARRAYS_INSTANCED_COMMAND_NV DRAW_ARRAYS_INSTANCED_COMMAND_NV}, {@link #GL_ELEMENT_ADDRESS_COMMAND_NV ELEMENT_ADDRESS_COMMAND_NV}, {@link #GL_ATTRIBUTE_ADDRESS_COMMAND_NV ATTRIBUTE_ADDRESS_COMMAND_NV}, {@link #GL_UNIFORM_ADDRESS_COMMAND_NV UNIFORM_ADDRESS_COMMAND_NV}, {@link #GL_BLEND_COLOR_COMMAND_NV BLEND_COLOR_COMMAND_NV}, {@link #GL_STENCIL_REF_COMMAND_NV STENCIL_REF_COMMAND_NV}, {@link #GL_LINE_WIDTH_COMMAND_NV LINE_WIDTH_COMMAND_NV}, {@link #GL_POLYGON_OFFSET_COMMAND_NV POLYGON_OFFSET_COMMAND_NV}, {@link #GL_ALPHA_REF_COMMAND_NV ALPHA_REF_COMMAND_NV}, {@link #GL_VIEWPORT_COMMAND_NV VIEWPORT_COMMAND_NV}, {@link #GL_SCISSOR_COMMAND_NV SCISSOR_COMMAND_NV}, {@link #GL_FRONT_FACE_COMMAND_NV FRONT_FACE_COMMAND_NV}
	 * @param size    provided as basic consistency check, since the size of each structure is fixed and no padding is allowed. The value is the sum of the header and
	 *                the command specific structure.
	 */
	public static int glGetCommandHeaderNV(int tokenID, int size) {
		long __functionAddress = getInstance().GetCommandHeaderNV;
		return nglGetCommandHeaderNV(tokenID, size, __functionAddress);
	}

	// --- [ glGetStageIndexNV ] ---

	/** JNI method for {@link #glGetStageIndexNV GetStageIndexNV} */
	@JavadocExclude
	public static native short nglGetStageIndexNV(int shadertype, long __functionAddress);

	/**
	 * Returns the 16bit value for a specific shader stage; the returned value is implementation specific. The value is to be used with the stage field within
	 * <code>UniformAddressCommandNV</code> tokens.
	 *
	 * @param shadertype the shader stage type
	 */
	public static short glGetStageIndexNV(int shadertype) {
		long __functionAddress = getInstance().GetStageIndexNV;
		return nglGetStageIndexNV(shadertype, __functionAddress);
	}

	// --- [ glDrawCommandsNV ] ---

	/** JNI method for {@link #glDrawCommandsNV DrawCommandsNV} */
	@JavadocExclude
	public static native void nglDrawCommandsNV(int primitiveMode, int buffer, long indirects, long sizes, int count, long __functionAddress);

	/** Unsafe version of {@link #glDrawCommandsNV DrawCommandsNV} */
	@JavadocExclude
	public static void nglDrawCommandsNV(int primitiveMode, int buffer, long indirects, long sizes, int count) {
		long __functionAddress = getInstance().DrawCommandsNV;
		nglDrawCommandsNV(primitiveMode, buffer, indirects, sizes, count, __functionAddress);
	}

	/**
	 * Accepts arrays of buffer addresses as an array of offsets <code>indirects</code> into a buffer named by <code>buffer</code>, an array of command
	 * lengths in <code>sizes</code>. All arrays have <code>count</code> entries.
	 *
	 * @param primitiveMode the primitive mode
	 * @param buffer        the buffer object name
	 * @param indirects     the array of offsets into the buffer
	 * @param sizes         the array of command lengths
	 * @param count         the number of commands
	 */
	public static void glDrawCommandsNV(int primitiveMode, int buffer, ByteBuffer indirects, ByteBuffer sizes, int count) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indirects, count << POINTER_SHIFT);
			checkBuffer(sizes, count << 2);
		}
		nglDrawCommandsNV(primitiveMode, buffer, memAddress(indirects), memAddress(sizes), count);
	}

	/** Alternative version of: {@link #glDrawCommandsNV DrawCommandsNV} */
	public static void glDrawCommandsNV(int primitiveMode, int buffer, PointerBuffer indirects, IntBuffer sizes) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(sizes, indirects.remaining());
		nglDrawCommandsNV(primitiveMode, buffer, memAddress(indirects), memAddress(sizes), indirects.remaining());
	}

	// --- [ glDrawCommandsAddressNV ] ---

	/** JNI method for {@link #glDrawCommandsAddressNV DrawCommandsAddressNV} */
	@JavadocExclude
	public static native void nglDrawCommandsAddressNV(int primitiveMode, long indirects, long sizes, int count, long __functionAddress);

	/** Unsafe version of {@link #glDrawCommandsAddressNV DrawCommandsAddressNV} */
	@JavadocExclude
	public static void nglDrawCommandsAddressNV(int primitiveMode, long indirects, long sizes, int count) {
		long __functionAddress = getInstance().DrawCommandsAddressNV;
		nglDrawCommandsAddressNV(primitiveMode, indirects, sizes, count, __functionAddress);
	}

	/**
	 * Accepts arrays of buffer addresses as an array of GPU addresses <code>indirects</code>, an array of command lengths in <code>sizes</code>. All arrays
	 * have <code>count</code> entries.
	 *
	 * @param primitiveMode the primitive mode
	 * @param indirects     the array of GPU addreses
	 * @param sizes         the array of command lengths
	 * @param count         the number of commands
	 */
	public static void glDrawCommandsAddressNV(int primitiveMode, ByteBuffer indirects, ByteBuffer sizes, int count) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indirects, count << 3);
			checkBuffer(sizes, count << 2);
		}
		nglDrawCommandsAddressNV(primitiveMode, memAddress(indirects), memAddress(sizes), count);
	}

	/** Alternative version of: {@link #glDrawCommandsAddressNV DrawCommandsAddressNV} */
	public static void glDrawCommandsAddressNV(int primitiveMode, LongBuffer indirects, IntBuffer sizes) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(sizes, indirects.remaining());
		nglDrawCommandsAddressNV(primitiveMode, memAddress(indirects), memAddress(sizes), indirects.remaining());
	}

	// --- [ glDrawCommandsStatesNV ] ---

	/** JNI method for {@link #glDrawCommandsStatesNV DrawCommandsStatesNV} */
	@JavadocExclude
	public static native void nglDrawCommandsStatesNV(int buffer, long indirects, long sizes, long states, long fbos, int count, long __functionAddress);

	/** Unsafe version of {@link #glDrawCommandsStatesNV DrawCommandsStatesNV} */
	@JavadocExclude
	public static void nglDrawCommandsStatesNV(int buffer, long indirects, long sizes, long states, long fbos, int count) {
		long __functionAddress = getInstance().DrawCommandsStatesNV;
		nglDrawCommandsStatesNV(buffer, indirects, sizes, states, fbos, count, __functionAddress);
	}

	/**
	 * Accepts arrays of buffer addresses as an array of offsets <code>indirects</code> into a buffer named by <code>buffer</code>, an array of command
	 * lengths in <code>sizes</code>, and an array of state object names in <code>states</code>, of which all names must be non-zero. Frame buffer object
	 * names are stored in <code>fbos</code> and can be either zero or non-zero. All arrays have <code>count</code> entries. The residency of textures used as
	 * attachment inside the state object's captured fbo or the passed fbo must managed explicitly.
	 *
	 * @param buffer    the buffer object name
	 * @param indirects the array of offsets into the buffer
	 * @param sizes     the array of command lengths
	 * @param states    the array of state object names
	 * @param fbos      the array of framebuffer object names
	 * @param count     the number of commands
	 */
	public static void glDrawCommandsStatesNV(int buffer, ByteBuffer indirects, ByteBuffer sizes, ByteBuffer states, ByteBuffer fbos, int count) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indirects, count << POINTER_SHIFT);
			checkBuffer(sizes, count << 2);
			checkBuffer(states, count << 2);
			checkBuffer(fbos, count << 2);
		}
		nglDrawCommandsStatesNV(buffer, memAddress(indirects), memAddress(sizes), memAddress(states), memAddress(fbos), count);
	}

	/** Alternative version of: {@link #glDrawCommandsStatesNV DrawCommandsStatesNV} */
	public static void glDrawCommandsStatesNV(int buffer, PointerBuffer indirects, IntBuffer sizes, IntBuffer states, IntBuffer fbos) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(sizes, indirects.remaining());
			checkBuffer(states, indirects.remaining());
			checkBuffer(fbos, indirects.remaining());
		}
		nglDrawCommandsStatesNV(buffer, memAddress(indirects), memAddress(sizes), memAddress(states), memAddress(fbos), indirects.remaining());
	}

	// --- [ glDrawCommandsStatesAddressNV ] ---

	/** JNI method for {@link #glDrawCommandsStatesAddressNV DrawCommandsStatesAddressNV} */
	@JavadocExclude
	public static native void nglDrawCommandsStatesAddressNV(long indirects, long sizes, long states, long fbos, int count, long __functionAddress);

	/** Unsafe version of {@link #glDrawCommandsStatesAddressNV DrawCommandsStatesAddressNV} */
	@JavadocExclude
	public static void nglDrawCommandsStatesAddressNV(long indirects, long sizes, long states, long fbos, int count) {
		long __functionAddress = getInstance().DrawCommandsStatesAddressNV;
		nglDrawCommandsStatesAddressNV(indirects, sizes, states, fbos, count, __functionAddress);
	}

	/**
	 * Accepts arrays of buffer addresses as an array of GPU addresses <code>indirects</code>, an array of command lengths in <code>sizes</code>, and an array
	 * of state object names in <code>states</code>, of which all names must be non-zero. Frame buffer object names are stored in <code>fbos</code> and can be
	 * either zero or non-zero. All arrays have <code>count</code> entries. The residency of textures used as attachment inside the state object's captured
	 * fbo or the passed fbo must managed explicitly.
	 *
	 * @param indirects the array of GPU addresses
	 * @param sizes     the array of command lengths
	 * @param states    the array of state object names
	 * @param fbos      the array of framebuffer object names
	 * @param count     the number of commands
	 */
	public static void glDrawCommandsStatesAddressNV(ByteBuffer indirects, ByteBuffer sizes, ByteBuffer states, ByteBuffer fbos, int count) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indirects, count << 3);
			checkBuffer(sizes, count << 2);
			checkBuffer(states, count << 2);
			checkBuffer(fbos, count << 2);
		}
		nglDrawCommandsStatesAddressNV(memAddress(indirects), memAddress(sizes), memAddress(states), memAddress(fbos), count);
	}

	/** Alternative version of: {@link #glDrawCommandsStatesAddressNV DrawCommandsStatesAddressNV} */
	public static void glDrawCommandsStatesAddressNV(LongBuffer indirects, IntBuffer sizes, IntBuffer states, IntBuffer fbos) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(sizes, indirects.remaining());
			checkBuffer(states, indirects.remaining());
			checkBuffer(fbos, indirects.remaining());
		}
		nglDrawCommandsStatesAddressNV(memAddress(indirects), memAddress(sizes), memAddress(states), memAddress(fbos), indirects.remaining());
	}

	// --- [ glCreateCommandListsNV ] ---

	/** JNI method for {@link #glCreateCommandListsNV CreateCommandListsNV} */
	@JavadocExclude
	public static native void nglCreateCommandListsNV(int n, long lists, long __functionAddress);

	/** Unsafe version of {@link #glCreateCommandListsNV CreateCommandListsNV} */
	@JavadocExclude
	public static void nglCreateCommandListsNV(int n, long lists) {
		long __functionAddress = getInstance().CreateCommandListsNV;
		nglCreateCommandListsNV(n, lists, __functionAddress);
	}

	/**
	 * Returns <code>n</code> previously unused command list names in <code>lists</code>, and creates a command list in the initial state for each name.
	 *
	 * @param n     the number of command list names to create
	 * @param lists the buffer in which to return the created command list names
	 */
	public static void glCreateCommandListsNV(int n, ByteBuffer lists) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(lists, n << 2);
		nglCreateCommandListsNV(n, memAddress(lists));
	}

	/** Alternative version of: {@link #glCreateCommandListsNV CreateCommandListsNV} */
	public static void glCreateCommandListsNV(IntBuffer lists) {
		nglCreateCommandListsNV(lists.remaining(), memAddress(lists));
	}

	/** Single return value version of: {@link #glCreateCommandListsNV CreateCommandListsNV} */
	public static int glCreateCommandListsNV() {
		APIBuffer __buffer = apiBuffer();
		int lists = __buffer.intParam();
		nglCreateCommandListsNV(1, __buffer.address(lists));
		return __buffer.intValue(lists);
	}

	// --- [ glDeleteCommandListsNV ] ---

	/** JNI method for {@link #glDeleteCommandListsNV DeleteCommandListsNV} */
	@JavadocExclude
	public static native void nglDeleteCommandListsNV(int n, long lists, long __functionAddress);

	/** Unsafe version of {@link #glDeleteCommandListsNV DeleteCommandListsNV} */
	@JavadocExclude
	public static void nglDeleteCommandListsNV(int n, long lists) {
		long __functionAddress = getInstance().DeleteCommandListsNV;
		nglDeleteCommandListsNV(n, lists, __functionAddress);
	}

	/**
	 * Deletes <code>n</code> command lists stored in <code>lists</code>. Once a command list is deleted it has no contents and its name is again unused.
	 * Unused names in <code>lists</code> are silently ignored, as is the value zero.
	 *
	 * @param n     the number of command list names to delete
	 * @param lists the buffer from which to read the command list names to delete
	 */
	public static void glDeleteCommandListsNV(int n, ByteBuffer lists) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(lists, n << 2);
		nglDeleteCommandListsNV(n, memAddress(lists));
	}

	/** Alternative version of: {@link #glDeleteCommandListsNV DeleteCommandListsNV} */
	public static void glDeleteCommandListsNV(IntBuffer lists) {
		nglDeleteCommandListsNV(lists.remaining(), memAddress(lists));
	}

	/** Single value version of: {@link #glDeleteCommandListsNV DeleteCommandListsNV} */
	public static void glDeleteCommandListsNV(int list) {
		APIBuffer __buffer = apiBuffer();
		int lists = __buffer.intParam(list);
		nglDeleteCommandListsNV(1, __buffer.address(lists));
	}

	// --- [ glIsCommandListNV ] ---

	/** JNI method for {@link #glIsCommandListNV IsCommandListNV} */
	@JavadocExclude
	public static native boolean nglIsCommandListNV(int list, long __functionAddress);

	/**
	 * Returns true if the specified name corresponds to a command list.
	 *
	 * @param list the object name to query
	 */
	public static boolean glIsCommandListNV(int list) {
		long __functionAddress = getInstance().IsCommandListNV;
		return nglIsCommandListNV(list, __functionAddress);
	}

	// --- [ glListDrawCommandsStatesClientNV ] ---

	/** JNI method for {@link #glListDrawCommandsStatesClientNV ListDrawCommandsStatesClientNV} */
	@JavadocExclude
	public static native void nglListDrawCommandsStatesClientNV(int list, int segment, long indirects, long sizes, long states, long fbos, int count, long __functionAddress);

	/** Unsafe version of {@link #glListDrawCommandsStatesClientNV ListDrawCommandsStatesClientNV} */
	@JavadocExclude
	public static void nglListDrawCommandsStatesClientNV(int list, int segment, long indirects, long sizes, long states, long fbos, int count) {
		long __functionAddress = getInstance().ListDrawCommandsStatesClientNV;
		nglListDrawCommandsStatesClientNV(list, segment, indirects, sizes, states, fbos, count, __functionAddress);
	}

	/**
	 * A list has multiple segments and each segment enqueues an ordered list of commands. This command enqueues the equivalent of the
	 * DrawCommandsStatesClientNV commands into the list indicated by <code>list</code> on the segment indicated by <code>segment</code>.
	 * 
	 * <p>The pre-validated state from {@code states} is saved into the command list, rather than a reference to the state object (i.e. the state objects or fbos
	 * could be deleted and the command list would be unaffected). This includes native GPU addresses for all textures indirectly referenced through the fbos
	 * passed or state objects' fbos attachments, therefore a recompile of the command list is required if such referenced textures change their allocation
	 * (for example due to resizing), as well as explicit management of the residency of the textures prior {@link #glCallCommandListNV CallCommandListNV}.</p>
	 * 
	 * <p>ListDrawCommandsStatesClientNV performs a by-value copy of the indirect data based on the provided client-side pointers. In this case the content is
	 * fully immutable, while the buffer-based versions can change the content of the buffers at any later time.</p>
	 *
	 * @param list      the command list
	 * @param segment   the segment
	 * @param indirects the array of GPU addresses
	 * @param sizes     the array of command lengths
	 * @param states    the array of state object names
	 * @param fbos      the array of framebuffer object names
	 * @param count     the number of commands
	 */
	public static void glListDrawCommandsStatesClientNV(int list, int segment, ByteBuffer indirects, ByteBuffer sizes, ByteBuffer states, ByteBuffer fbos, int count) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indirects, count << POINTER_SHIFT);
			checkBuffer(sizes, count << POINTER_SHIFT);
			checkBuffer(states, count << 2);
			checkBuffer(fbos, count << 2);
		}
		nglListDrawCommandsStatesClientNV(list, segment, memAddress(indirects), memAddress(sizes), memAddress(states), memAddress(fbos), count);
	}

	/** Alternative version of: {@link #glListDrawCommandsStatesClientNV ListDrawCommandsStatesClientNV} */
	public static void glListDrawCommandsStatesClientNV(int list, int segment, PointerBuffer indirects, PointerBuffer sizes, IntBuffer states, IntBuffer fbos) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(sizes, indirects.remaining());
			checkBuffer(states, indirects.remaining());
			checkBuffer(fbos, indirects.remaining());
		}
		nglListDrawCommandsStatesClientNV(list, segment, memAddress(indirects), memAddress(sizes), memAddress(states), memAddress(fbos), indirects.remaining());
	}

	// --- [ glCommandListSegmentsNV ] ---

	/** JNI method for {@link #glCommandListSegmentsNV CommandListSegmentsNV} */
	@JavadocExclude
	public static native void nglCommandListSegmentsNV(int list, int segments, long __functionAddress);

	/**
	 * Indicates that {@code list} will have {@code segments} ordered sequences of commands that it enqueues. This must be called before any commands are
	 * enqueued. In the initial state, a command list has a single segment.
	 *
	 * @param list     the command list
	 * @param segments the number of ordered sequences of commands
	 */
	public static void glCommandListSegmentsNV(int list, int segments) {
		long __functionAddress = getInstance().CommandListSegmentsNV;
		nglCommandListSegmentsNV(list, segments, __functionAddress);
	}

	// --- [ glCompileCommandListNV ] ---

	/** JNI method for {@link #glCompileCommandListNV CompileCommandListNV} */
	@JavadocExclude
	public static native void nglCompileCommandListNV(int list, long __functionAddress);

	/**
	 * Makes the list indicated by <code>list</code> switch from allowing collection of commands to allowing its execution. At this time, the implementation
	 * may generate optimized commands to transition between states as efficiently as possible.
	 *
	 * @param list the command list to compile
	 */
	public static void glCompileCommandListNV(int list) {
		long __functionAddress = getInstance().CompileCommandListNV;
		nglCompileCommandListNV(list, __functionAddress);
	}

	// --- [ glCallCommandListNV ] ---

	/** JNI method for {@link #glCallCommandListNV CallCommandListNV} */
	@JavadocExclude
	public static native void nglCallCommandListNV(int list, long __functionAddress);

	/**
	 * Executes the command list indicated by <code>list</code>, which operates as if the DrawCommandsStates* commands were replayed in the order they were
	 * enqueued on each segment, starting from segment zero and proceeding to the maximum segment. All buffer or texture resources' residency must be managed
	 * explicitly, including texture attachments of the effective fbos during list enqueuing.
	 *
	 * @param list the command list to call
	 */
	public static void glCallCommandListNV(int list) {
		long __functionAddress = getInstance().CallCommandListNV;
		nglCallCommandListNV(list, __functionAddress);
	}

}