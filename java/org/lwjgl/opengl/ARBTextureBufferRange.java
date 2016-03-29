/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/texture_buffer_range.txt">ARB_texture_buffer_range</a> extension.
 * 
 * <p>{@link ARBTextureBufferObject ARB_texture_buffer_object} (which was promoted to core in OpenGL 3.1) introduced the ability to attach the data store of a buffer object to a buffer
 * texture and access it from shaders. The extension only allows the entire store of the buffer object to the texture. This extension expands on this and
 * allows a sub-range of the buffer's data store to be attached to a texture. This can be used, for example, to allow multiple buffer textures to be backed
 * by independent sub-ranges of the same buffer object, or for different sub-ranges of a single buffer object to be used for different purposes.</p>
 * 
 * <p>Requires {@link GL15 OpenGL 1.5}. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
 */
public class ARBTextureBufferRange {

	/** Accepted by the {@code pname} parameter of GetTexLevelParameter. */
	public static final int
		GL_TEXTURE_BUFFER_OFFSET = 0x919D,
		GL_TEXTURE_BUFFER_SIZE   = 0x919E;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT = 0x919F;

	protected ARBTextureBufferRange() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps, java.util.Set<String> ext) {
		return checkFunctions(
			caps.glTexBufferRange, ext.contains("GL_EXT_direct_state_access") ? caps.glTextureBufferRangeEXT : -1L
		);
	}

	// --- [ glTexBufferRange ] ---

	/**
	 * Binds a range of a buffer's data store to a buffer texture.
	 *
	 * @param target         the target of the operation. Must be:<br>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}
	 * @param internalformat the internal format of the data in the store belonging to {@code buffer}
	 * @param buffer         the name of the buffer object whose storage to attach to the active buffer texture
	 * @param offset         the offset of the start of the range of the buffer's data store to attach
	 * @param size           the size of the range of the buffer's data store to attach
	 */
	public static void glTexBufferRange(int target, int internalformat, int buffer, long offset, long size) {
		long __functionAddress = GL.getCapabilities().glTexBufferRange;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPPV(__functionAddress, target, internalformat, buffer, offset, size);
	}

	// --- [ glTextureBufferRangeEXT ] ---

	/**
	 * DSA version of {@link #glTexBufferRange TexBufferRange}.
	 *
	 * @param texture        the texture object
	 * @param target         the target of the operation. Must be:<br>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}
	 * @param internalformat the internal format of the data in the store belonging to {@code buffer}
	 * @param buffer         the name of the buffer object whose storage to attach to the active buffer texture
	 * @param offset         the offset of the start of the range of the buffer's data store to attach
	 * @param size           the size of the range of the buffer's data store to attach
	 */
	public static void glTextureBufferRangeEXT(int texture, int target, int internalformat, int buffer, long offset, long size) {
		long __functionAddress = GL.getCapabilities().glTextureBufferRangeEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIIPPV(__functionAddress, texture, target, internalformat, buffer, offset, size);
	}

}