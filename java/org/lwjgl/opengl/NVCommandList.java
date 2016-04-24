/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/command_list.txt">NV_command_list</a> extension.
 * 
 * <p>This extension adds a few new features designed to provide very low overhead batching and replay of rendering commands and state changes:</p>
 * 
 * <ul>
 * <li>A state object, which stores a pre-validated representation of the state of (almost) the entire pipeline.</li>
 * <li>A more flexible and extensible MultiDrawIndirect (MDI) type of mechanism, using a token-based command stream, allowing to setup binding state and
 * emit draw calls.</li>
 * <li>A set of functions to execute a list of the token-based command streams with state object changes interleaved with the streams.</li>
 * <li>Command lists enabling compilation and reuse of sequences of command streams and state object changes.</li>
 * </ul>
 * 
 * <p>Because state objects reflect the state of the entire pipeline, it is expected that they can be pre-validated and executed efficiently. It is also
 * expected that when state objects are combined into a command list, the command list can diff consecutive state objects to produce a reduced/ optimized
 * set of state changes specific to that transition.</p>
 * 
 * <p>The token-based command stream can also be stored in regular buffer objects and therefore be modified by the server itself. This allows more complex
 * work creation than the original MDI approach, which was limited to emitting draw calls only.</p>
 * 
 * <h3>Command structures</h3>
 * 
 * <pre><code>typedef struct {
  uint  header;
} TerminateSequenceCommandNV;

typedef struct {
  uint  header;
} NOPCommandNV;

typedef  struct {
  uint  header;
  uint  count;
  uint  firstIndex;
  uint  baseVertex;
} DrawElementsCommandNV;

typedef  struct {
  uint  header;
  uint  count;
  uint  first;
} DrawArraysCommandNV;

typedef  struct {
  uint  header;
  uint  mode;
  uint  count;
  uint  instanceCount;
  uint  firstIndex;
  uint  baseVertex;
  uint  baseInstance;
} DrawElementsInstancedCommandNV;

typedef  struct {
  uint  header;
  uint  mode;
  uint  count;
  uint  instanceCount;
  uint  first;
  uint  baseInstance;
} DrawArraysInstancedCommandNV;

typedef struct {
  uint  header;
  uint  addressLo;
  uint  addressHi;
  uint  typeSizeInByte;
} ElementAddressCommandNV;

typedef struct {
  uint  header;
  uint  index;
  uint  addressLo;
  uint  addressHi;
} AttributeAddressCommandNV;

typedef struct {
  uint    header;
  ushort  index;
  ushort  stage;
  uint    addressLo;
  uint    addressHi;
} UniformAddressCommandNV;

typedef struct {
  uint  header;
  float red;
  float green;
  float blue;
  float alpha;
} BlendColorCommandNV;

typedef struct {
  uint  header;
  uint  frontStencilRef;
  uint  backStencilRef;
} StencilRefCommandNV;

typedef struct {
  uint  header;
  float lineWidth;
} LineWidthCommandNV;

typedef struct {
  uint  header;
  float scale;
  float bias;
} PolygonOffsetCommandNV;

typedef struct {
  uint  header;
  float alphaRef;
} AlphaRefCommandNV;

typedef struct {
  uint  header;
  uint  x;
  uint  y;
  uint  width;
  uint  height;
} ViewportCommandNV; // only ViewportIndex 0

typedef struct {
  uint  header;
  uint  x;
  uint  y;
  uint  width;
  uint  height;
} ScissorCommandNV; // only ViewportIndex 0

typedef struct {
  uint  header;
  uint  frontFace; // 0 for CW, 1 for CCW
} FrontFaceCommandNV;</code></pre>
 * 
 * <p>Tight packing is used for all structures.</p>
 */
public class NVCommandList {

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

	protected NVCommandList() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glCreateStatesNV, caps.glDeleteStatesNV, caps.glIsStateNV, caps.glStateCaptureNV, caps.glGetCommandHeaderNV, caps.glGetStageIndexNV, 
			caps.glDrawCommandsNV, caps.glDrawCommandsAddressNV, caps.glDrawCommandsStatesNV, caps.glDrawCommandsStatesAddressNV, caps.glCreateCommandListsNV, 
			caps.glDeleteCommandListsNV, caps.glIsCommandListNV, caps.glListDrawCommandsStatesClientNV, caps.glCommandListSegmentsNV, 
			caps.glCompileCommandListNV, caps.glCallCommandListNV
		);
	}

	// --- [ glCreateStatesNV ] ---

	/**
	 * Returns {@code n} previously unused state object names in {@code states}, and creates a state object in the initial state for each name.
	 *
	 * @param n      the number of state object names to create
	 * @param states the buffer in which to write the created state object names
	 */
	public static void nglCreateStatesNV(int n, long states) {
		long __functionAddress = GL.getCapabilities().glCreateStatesNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, states);
	}

	/**
	 * Returns {@code n} previously unused state object names in {@code states}, and creates a state object in the initial state for each name.
	 *
	 * @param states the buffer in which to write the created state object names
	 */
	public static void glCreateStatesNV(IntBuffer states) {
		nglCreateStatesNV(states.remaining(), memAddress(states));
	}

	/** Returns {@code n} previously unused state object names in {@code states}, and creates a state object in the initial state for each name. */
	public static int glCreateStatesNV() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer states = stack.callocInt(1);
			nglCreateStatesNV(1, memAddress(states));
			return states.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glDeleteStatesNV ] ---

	/**
	 * Deletes {@code n} names of state objects given by {@code states}. Once a state object is deleted it has no contents and its name is again unused.
	 * Unused names in {@code states} are silently ignored, as is the value zero.
	 *
	 * @param n      the number of state object names to delete
	 * @param states the buffer from which to read the state object names to delete
	 */
	public static void nglDeleteStatesNV(int n, long states) {
		long __functionAddress = GL.getCapabilities().glDeleteStatesNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, states);
	}

	/**
	 * Deletes {@code n} names of state objects given by {@code states}. Once a state object is deleted it has no contents and its name is again unused.
	 * Unused names in {@code states} are silently ignored, as is the value zero.
	 *
	 * @param states the buffer from which to read the state object names to delete
	 */
	public static void glDeleteStatesNV(IntBuffer states) {
		nglDeleteStatesNV(states.remaining(), memAddress(states));
	}

	/**
	 * Deletes {@code n} names of state objects given by {@code states}. Once a state object is deleted it has no contents and its name is again unused.
	 * Unused names in {@code states} are silently ignored, as is the value zero.
	 */
	public static void glDeleteStatesNV(int state) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer states = stack.ints(state);
			nglDeleteStatesNV(1, memAddress(states));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glIsStateNV ] ---

	/**
	 * Returns true if the specified name corresponds to a state object.
	 *
	 * @param state the object name to test
	 */
	public static boolean glIsStateNV(int state) {
		long __functionAddress = GL.getCapabilities().glIsStateNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, state);
	}

	// --- [ glStateCaptureNV ] ---

	/**
	 * Captures the current state of the rendering pipeline into the object indicated by {@code state}.
	 * 
	 * <p>The captured rendering state includes:</p>
	 * 
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
	 * </ul>
	 *
	 * @param state the state object into which to capture the current rendering state
	 * @param mode  the basic Begin mode that this state object must be used with. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
	 */
	public static void glStateCaptureNV(int state, int mode) {
		long __functionAddress = GL.getCapabilities().glStateCaptureNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, state, mode);
	}

	// --- [ glGetCommandHeaderNV ] ---

	/**
	 * Returns the encoded 32bit header value for a given command; the returned value is implementation specific.
	 *
	 * @param tokenID the command to query. One of:<br><table><tr><td>{@link #GL_TERMINATE_SEQUENCE_COMMAND_NV TERMINATE_SEQUENCE_COMMAND_NV}</td><td>{@link #GL_NOP_COMMAND_NV NOP_COMMAND_NV}</td><td>{@link #GL_DRAW_ELEMENTS_COMMAND_NV DRAW_ELEMENTS_COMMAND_NV}</td></tr><tr><td>{@link #GL_DRAW_ARRAYS_COMMAND_NV DRAW_ARRAYS_COMMAND_NV}</td><td>{@link #GL_DRAW_ELEMENTS_STRIP_COMMAND_NV DRAW_ELEMENTS_STRIP_COMMAND_NV}</td><td>{@link #GL_DRAW_ARRAYS_STRIP_COMMAND_NV DRAW_ARRAYS_STRIP_COMMAND_NV}</td></tr><tr><td>{@link #GL_DRAW_ELEMENTS_INSTANCED_COMMAND_NV DRAW_ELEMENTS_INSTANCED_COMMAND_NV}</td><td>{@link #GL_DRAW_ARRAYS_INSTANCED_COMMAND_NV DRAW_ARRAYS_INSTANCED_COMMAND_NV}</td><td>{@link #GL_ELEMENT_ADDRESS_COMMAND_NV ELEMENT_ADDRESS_COMMAND_NV}</td></tr><tr><td>{@link #GL_ATTRIBUTE_ADDRESS_COMMAND_NV ATTRIBUTE_ADDRESS_COMMAND_NV}</td><td>{@link #GL_UNIFORM_ADDRESS_COMMAND_NV UNIFORM_ADDRESS_COMMAND_NV}</td><td>{@link #GL_BLEND_COLOR_COMMAND_NV BLEND_COLOR_COMMAND_NV}</td></tr><tr><td>{@link #GL_STENCIL_REF_COMMAND_NV STENCIL_REF_COMMAND_NV}</td><td>{@link #GL_LINE_WIDTH_COMMAND_NV LINE_WIDTH_COMMAND_NV}</td><td>{@link #GL_POLYGON_OFFSET_COMMAND_NV POLYGON_OFFSET_COMMAND_NV}</td></tr><tr><td>{@link #GL_ALPHA_REF_COMMAND_NV ALPHA_REF_COMMAND_NV}</td><td>{@link #GL_VIEWPORT_COMMAND_NV VIEWPORT_COMMAND_NV}</td><td>{@link #GL_SCISSOR_COMMAND_NV SCISSOR_COMMAND_NV}</td></tr><tr><td>{@link #GL_FRONT_FACE_COMMAND_NV FRONT_FACE_COMMAND_NV}</td></tr></table>
	 * @param size    provided as basic consistency check, since the size of each structure is fixed and no padding is allowed. The value is the sum of the header and
	 *                the command specific structure.
	 */
	public static int glGetCommandHeaderNV(int tokenID, int size) {
		long __functionAddress = GL.getCapabilities().glGetCommandHeaderNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callI(__functionAddress, tokenID, size);
	}

	// --- [ glGetStageIndexNV ] ---

	/**
	 * Returns the 16bit value for a specific shader stage; the returned value is implementation specific. The value is to be used with the stage field within
	 * {@code UniformAddressCommandNV} tokens.
	 *
	 * @param shadertype the shader stage type
	 */
	public static short glGetStageIndexNV(int shadertype) {
		long __functionAddress = GL.getCapabilities().glGetStageIndexNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callS(__functionAddress, shadertype);
	}

	// --- [ glDrawCommandsNV ] ---

	/**
	 * Accepts arrays of buffer addresses as an array of offsets {@code indirects} into a buffer named by {@code buffer}, an array of command lengths in
	 * {@code sizes}. All arrays have {@code count} entries.
	 *
	 * @param primitiveMode the primitive mode
	 * @param buffer        the buffer object name
	 * @param indirects     the array of offsets into the buffer
	 * @param sizes         the array of command lengths
	 * @param count         the number of commands
	 */
	public static void nglDrawCommandsNV(int primitiveMode, int buffer, long indirects, long sizes, int count) {
		long __functionAddress = GL.getCapabilities().glDrawCommandsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, primitiveMode, buffer, indirects, sizes, count);
	}

	/**
	 * Accepts arrays of buffer addresses as an array of offsets {@code indirects} into a buffer named by {@code buffer}, an array of command lengths in
	 * {@code sizes}. All arrays have {@code count} entries.
	 *
	 * @param primitiveMode the primitive mode
	 * @param buffer        the buffer object name
	 * @param indirects     the array of offsets into the buffer
	 * @param sizes         the array of command lengths
	 */
	public static void glDrawCommandsNV(int primitiveMode, int buffer, PointerBuffer indirects, IntBuffer sizes) {
		if ( CHECKS )
			checkBuffer(sizes, indirects.remaining());
		nglDrawCommandsNV(primitiveMode, buffer, memAddress(indirects), memAddress(sizes), indirects.remaining());
	}

	// --- [ glDrawCommandsAddressNV ] ---

	/**
	 * Accepts arrays of buffer addresses as an array of GPU addresses {@code indirects}, an array of sequence lengths in {@code sizes}. All arrays have
	 * {@code count} entries.
	 *
	 * @param primitiveMode the primitive mode
	 * @param indirects     the array of GPU addreses
	 * @param sizes         the array of command lengths
	 * @param count         the number of commands
	 */
	public static void nglDrawCommandsAddressNV(int primitiveMode, long indirects, long sizes, int count) {
		long __functionAddress = GL.getCapabilities().glDrawCommandsAddressNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, primitiveMode, indirects, sizes, count);
	}

	/**
	 * Accepts arrays of buffer addresses as an array of GPU addresses {@code indirects}, an array of sequence lengths in {@code sizes}. All arrays have
	 * {@code count} entries.
	 *
	 * @param primitiveMode the primitive mode
	 * @param indirects     the array of GPU addreses
	 * @param sizes         the array of command lengths
	 */
	public static void glDrawCommandsAddressNV(int primitiveMode, LongBuffer indirects, IntBuffer sizes) {
		if ( CHECKS )
			checkBuffer(sizes, indirects.remaining());
		nglDrawCommandsAddressNV(primitiveMode, memAddress(indirects), memAddress(sizes), indirects.remaining());
	}

	// --- [ glDrawCommandsStatesNV ] ---

	/**
	 * Accepts arrays of buffer addresses as an array of offsets {@code indirects} into a buffer named by {@code buffer}, an array of command lengths in
	 * {@code sizes}, and an array of state object names in {@code states}, of which all names must be non-zero. Frame buffer object names are stored in
	 * {@code fbos} and can be either zero or non-zero. All arrays have {@code count} entries. The residency of textures used as attachment inside the state
	 * object's captured fbo or the passed fbo must managed explicitly.
	 *
	 * @param buffer    the buffer object name
	 * @param indirects the array of offsets into the buffer
	 * @param sizes     the array of command lengths
	 * @param states    the array of state object names
	 * @param fbos      the array of framebuffer object names
	 * @param count     the number of commands
	 */
	public static void nglDrawCommandsStatesNV(int buffer, long indirects, long sizes, long states, long fbos, int count) {
		long __functionAddress = GL.getCapabilities().glDrawCommandsStatesNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPPV(__functionAddress, buffer, indirects, sizes, states, fbos, count);
	}

	/**
	 * Accepts arrays of buffer addresses as an array of offsets {@code indirects} into a buffer named by {@code buffer}, an array of command lengths in
	 * {@code sizes}, and an array of state object names in {@code states}, of which all names must be non-zero. Frame buffer object names are stored in
	 * {@code fbos} and can be either zero or non-zero. All arrays have {@code count} entries. The residency of textures used as attachment inside the state
	 * object's captured fbo or the passed fbo must managed explicitly.
	 *
	 * @param buffer    the buffer object name
	 * @param indirects the array of offsets into the buffer
	 * @param sizes     the array of command lengths
	 * @param states    the array of state object names
	 * @param fbos      the array of framebuffer object names
	 */
	public static void glDrawCommandsStatesNV(int buffer, PointerBuffer indirects, IntBuffer sizes, IntBuffer states, IntBuffer fbos) {
		if ( CHECKS ) {
			checkBuffer(sizes, indirects.remaining());
			checkBuffer(states, indirects.remaining());
			checkBuffer(fbos, indirects.remaining());
		}
		nglDrawCommandsStatesNV(buffer, memAddress(indirects), memAddress(sizes), memAddress(states), memAddress(fbos), indirects.remaining());
	}

	// --- [ glDrawCommandsStatesAddressNV ] ---

	/**
	 * Accepts arrays of buffer addresses as an array of GPU addresses {@code indirects}, an array of command lengths in {@code sizes}, and an array of state
	 * object names in {@code states}, of which all names must be non-zero. Frame buffer object names are stored in {@code fbos} and can be either zero or
	 * non-zero. All arrays have {@code count} entries. The residency of textures used as attachment inside the state object's captured fbo or the passed fbo
	 * must managed explicitly.
	 *
	 * @param indirects the array of GPU addresses
	 * @param sizes     the array of command lengths
	 * @param states    the array of state object names
	 * @param fbos      the array of framebuffer object names
	 * @param count     the number of commands
	 */
	public static void nglDrawCommandsStatesAddressNV(long indirects, long sizes, long states, long fbos, int count) {
		long __functionAddress = GL.getCapabilities().glDrawCommandsStatesAddressNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPPV(__functionAddress, indirects, sizes, states, fbos, count);
	}

	/**
	 * Accepts arrays of buffer addresses as an array of GPU addresses {@code indirects}, an array of command lengths in {@code sizes}, and an array of state
	 * object names in {@code states}, of which all names must be non-zero. Frame buffer object names are stored in {@code fbos} and can be either zero or
	 * non-zero. All arrays have {@code count} entries. The residency of textures used as attachment inside the state object's captured fbo or the passed fbo
	 * must managed explicitly.
	 *
	 * @param indirects the array of GPU addresses
	 * @param sizes     the array of command lengths
	 * @param states    the array of state object names
	 * @param fbos      the array of framebuffer object names
	 */
	public static void glDrawCommandsStatesAddressNV(LongBuffer indirects, IntBuffer sizes, IntBuffer states, IntBuffer fbos) {
		if ( CHECKS ) {
			checkBuffer(sizes, indirects.remaining());
			checkBuffer(states, indirects.remaining());
			checkBuffer(fbos, indirects.remaining());
		}
		nglDrawCommandsStatesAddressNV(memAddress(indirects), memAddress(sizes), memAddress(states), memAddress(fbos), indirects.remaining());
	}

	// --- [ glCreateCommandListsNV ] ---

	/**
	 * Returns {@code n} previously unused command list names in {@code lists}, and creates a command list in the initial state for each name.
	 *
	 * @param n     the number of command list names to create
	 * @param lists the buffer in which to return the created command list names
	 */
	public static void nglCreateCommandListsNV(int n, long lists) {
		long __functionAddress = GL.getCapabilities().glCreateCommandListsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, lists);
	}

	/**
	 * Returns {@code n} previously unused command list names in {@code lists}, and creates a command list in the initial state for each name.
	 *
	 * @param lists the buffer in which to return the created command list names
	 */
	public static void glCreateCommandListsNV(IntBuffer lists) {
		nglCreateCommandListsNV(lists.remaining(), memAddress(lists));
	}

	/** Returns {@code n} previously unused command list names in {@code lists}, and creates a command list in the initial state for each name. */
	public static int glCreateCommandListsNV() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer lists = stack.callocInt(1);
			nglCreateCommandListsNV(1, memAddress(lists));
			return lists.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glDeleteCommandListsNV ] ---

	/**
	 * Deletes {@code n} command lists stored in {@code lists}. Once a command list is deleted it has no contents and its name is again unused. Unused names
	 * in {@code lists} are silently ignored, as is the value zero.
	 *
	 * @param n     the number of command list names to delete
	 * @param lists the buffer from which to read the command list names to delete
	 */
	public static void nglDeleteCommandListsNV(int n, long lists) {
		long __functionAddress = GL.getCapabilities().glDeleteCommandListsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, lists);
	}

	/**
	 * Deletes {@code n} command lists stored in {@code lists}. Once a command list is deleted it has no contents and its name is again unused. Unused names
	 * in {@code lists} are silently ignored, as is the value zero.
	 *
	 * @param lists the buffer from which to read the command list names to delete
	 */
	public static void glDeleteCommandListsNV(IntBuffer lists) {
		nglDeleteCommandListsNV(lists.remaining(), memAddress(lists));
	}

	/**
	 * Deletes {@code n} command lists stored in {@code lists}. Once a command list is deleted it has no contents and its name is again unused. Unused names
	 * in {@code lists} are silently ignored, as is the value zero.
	 */
	public static void glDeleteCommandListsNV(int list) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer lists = stack.ints(list);
			nglDeleteCommandListsNV(1, memAddress(lists));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glIsCommandListNV ] ---

	/**
	 * Returns true if the specified name corresponds to a command list.
	 *
	 * @param list the object name to query
	 */
	public static boolean glIsCommandListNV(int list) {
		long __functionAddress = GL.getCapabilities().glIsCommandListNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, list);
	}

	// --- [ glListDrawCommandsStatesClientNV ] ---

	/**
	 * A list has multiple segments and each segment enqueues an ordered list of commands. This command enqueues the equivalent of the
	 * DrawCommandsStatesClientNV commands into the list indicated by {@code list} on the segment indicated by {@code segment}.
	 * 
	 * <p>A list has multiple segments and each segment enqueues an ordered list of command sequences. This command enqueues the equivalent of the
	 * DrawCommandsStatesNV commands into the list indicated by {@code list} on the segment indicated by {@code segment} except that the sequence data is
	 * copied from the sequences pointed to by the {@code indirects} pointer. The {@code indirects} pointer should point to a list of size {@code count} of
	 * pointers, each of which should point to a command sequence.</p>
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
	public static void nglListDrawCommandsStatesClientNV(int list, int segment, long indirects, long sizes, long states, long fbos, int count) {
		long __functionAddress = GL.getCapabilities().glListDrawCommandsStatesClientNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPPV(__functionAddress, list, segment, indirects, sizes, states, fbos, count);
	}

	/**
	 * A list has multiple segments and each segment enqueues an ordered list of commands. This command enqueues the equivalent of the
	 * DrawCommandsStatesClientNV commands into the list indicated by {@code list} on the segment indicated by {@code segment}.
	 * 
	 * <p>A list has multiple segments and each segment enqueues an ordered list of command sequences. This command enqueues the equivalent of the
	 * DrawCommandsStatesNV commands into the list indicated by {@code list} on the segment indicated by {@code segment} except that the sequence data is
	 * copied from the sequences pointed to by the {@code indirects} pointer. The {@code indirects} pointer should point to a list of size {@code count} of
	 * pointers, each of which should point to a command sequence.</p>
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
	 */
	public static void glListDrawCommandsStatesClientNV(int list, int segment, PointerBuffer indirects, PointerBuffer sizes, IntBuffer states, IntBuffer fbos) {
		if ( CHECKS ) {
			checkBuffer(sizes, indirects.remaining());
			checkBuffer(states, indirects.remaining());
			checkBuffer(fbos, indirects.remaining());
		}
		nglListDrawCommandsStatesClientNV(list, segment, memAddress(indirects), memAddress(sizes), memAddress(states), memAddress(fbos), indirects.remaining());
	}

	// --- [ glCommandListSegmentsNV ] ---

	/**
	 * Indicates that {@code list} will have {@code segments} number of segments, each of which is a list of command sequences that it enqueues. This must be
	 * called before any commands are enqueued. In the initial state, a command list has a single segment.
	 *
	 * @param list     the command list
	 * @param segments the number of ordered sequences of commands
	 */
	public static void glCommandListSegmentsNV(int list, int segments) {
		long __functionAddress = GL.getCapabilities().glCommandListSegmentsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, list, segments);
	}

	// --- [ glCompileCommandListNV ] ---

	/**
	 * Makes the list indicated by {@code list} switch from allowing collection of commands to allowing its execution. At this time, the implementation may
	 * generate optimized commands to transition between states as efficiently as possible.
	 *
	 * @param list the command list to compile
	 */
	public static void glCompileCommandListNV(int list) {
		long __functionAddress = GL.getCapabilities().glCompileCommandListNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, list);
	}

	// --- [ glCallCommandListNV ] ---

	/**
	 * Executes the command list indicated by {@code list}, which operates as if the DrawCommandsStates* commands were replayed in the order they were
	 * enqueued on each segment, starting from segment zero and proceeding to the maximum segment. All buffer or texture resources' residency must be managed
	 * explicitly, including texture attachments of the effective fbos during list enqueuing.
	 *
	 * @param list the command list to call
	 */
	public static void glCallCommandListNV(int list) {
		long __functionAddress = GL.getCapabilities().glCallCommandListNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, list);
	}

	/** Array version of: {@link #glCreateStatesNV CreateStatesNV} */
	public static void glCreateStatesNV(int[] states) {
		long __functionAddress = GL.getCapabilities().glCreateStatesNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, states.length, states);
	}

	/** Array version of: {@link #glDeleteStatesNV DeleteStatesNV} */
	public static void glDeleteStatesNV(int[] states) {
		long __functionAddress = GL.getCapabilities().glDeleteStatesNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, states.length, states);
	}

	/** Array version of: {@link #glDrawCommandsNV DrawCommandsNV} */
	public static void glDrawCommandsNV(int primitiveMode, int buffer, PointerBuffer indirects, int[] sizes) {
		long __functionAddress = GL.getCapabilities().glDrawCommandsNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(sizes, indirects.remaining());
		}
		callPPV(__functionAddress, primitiveMode, buffer, memAddress(indirects), sizes, indirects.remaining());
	}

	/** Array version of: {@link #glDrawCommandsAddressNV DrawCommandsAddressNV} */
	public static void glDrawCommandsAddressNV(int primitiveMode, long[] indirects, int[] sizes) {
		long __functionAddress = GL.getCapabilities().glDrawCommandsAddressNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(sizes, indirects.length);
		}
		callPPV(__functionAddress, primitiveMode, indirects, sizes, indirects.length);
	}

	/** Array version of: {@link #glDrawCommandsStatesNV DrawCommandsStatesNV} */
	public static void glDrawCommandsStatesNV(int buffer, PointerBuffer indirects, int[] sizes, int[] states, int[] fbos) {
		long __functionAddress = GL.getCapabilities().glDrawCommandsStatesNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(sizes, indirects.remaining());
			checkBuffer(states, indirects.remaining());
			checkBuffer(fbos, indirects.remaining());
		}
		callPPPPV(__functionAddress, buffer, memAddress(indirects), sizes, states, fbos, indirects.remaining());
	}

	/** Array version of: {@link #glDrawCommandsStatesAddressNV DrawCommandsStatesAddressNV} */
	public static void glDrawCommandsStatesAddressNV(long[] indirects, int[] sizes, int[] states, int[] fbos) {
		long __functionAddress = GL.getCapabilities().glDrawCommandsStatesAddressNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(sizes, indirects.length);
			checkBuffer(states, indirects.length);
			checkBuffer(fbos, indirects.length);
		}
		callPPPPV(__functionAddress, indirects, sizes, states, fbos, indirects.length);
	}

	/** Array version of: {@link #glCreateCommandListsNV CreateCommandListsNV} */
	public static void glCreateCommandListsNV(int[] lists) {
		long __functionAddress = GL.getCapabilities().glCreateCommandListsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, lists.length, lists);
	}

	/** Array version of: {@link #glDeleteCommandListsNV DeleteCommandListsNV} */
	public static void glDeleteCommandListsNV(int[] lists) {
		long __functionAddress = GL.getCapabilities().glDeleteCommandListsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, lists.length, lists);
	}

	/** Array version of: {@link #glListDrawCommandsStatesClientNV ListDrawCommandsStatesClientNV} */
	public static void glListDrawCommandsStatesClientNV(int list, int segment, PointerBuffer indirects, PointerBuffer sizes, int[] states, int[] fbos) {
		long __functionAddress = GL.getCapabilities().glListDrawCommandsStatesClientNV;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(sizes, indirects.remaining());
			checkBuffer(states, indirects.remaining());
			checkBuffer(fbos, indirects.remaining());
		}
		callPPPPV(__functionAddress, list, segment, memAddress(indirects), memAddress(sizes), states, fbos, indirects.remaining());
	}

}