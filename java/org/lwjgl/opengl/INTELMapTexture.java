/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/INTEL/map_texture.txt">INTEL_map_texture</a> extension.
 * 
 * <p>Systems with integrated GPUs can share the same physical memory between CPU and GPU. This feature, if exposed by API, can bring significant performance
 * benefits for graphics applications by reducing the complexity of uploading/accessing texture contents. This extension enables CPU direct access to the
 * GPU memory holding textures.</p>
 * 
 * <p>The problem with texture memory directly exposed to clients is that textures are often 'tiled'. Texels are kept in specific layout to improve locality
 * of reference and thus performance of texturing. This 'tiling' is specific to particular hardware and would be thus difficult to use.</p>
 * 
 * <p>This extension allows to create textures with 'linear' layout which allows for simplified access on user side (potentially sacrificing some performance
 * during texture sampling).</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0}.</p>
 */
public class INTELMapTexture {

	/** Accepted by the {@code pname} parameter of TexParameteri, for target TEXTURE_2D. */
	public static final int GL_TEXTURE_MEMORY_LAYOUT_INTEL = 0x83FF;

	/** Accepted by the {@code params} when {@code pname} is set to {@code TEXTURE_MEMORY_LAYOUT_INTEL}. */
	public static final int
		GL_LAYOUT_DEFAULT_INTEL           = 0,
		GL_LAYOUT_LINEAR_INTEL            = 1,
		GL_LAYOUT_LINEAR_CPU_CACHED_INTEL = 2;

	protected INTELMapTexture() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glSyncTextureINTEL, caps.glUnmapTexture2DINTEL, caps.glMapTexture2DINTEL
		);
	}

	// --- [ glSyncTextureINTEL ] ---

	/**
	 * Makes sure that changes made by CPU are visible to GPU by flushing texture cache in GPU. The GL implementation tracks the cache usage and ignores the
	 * command if such flush is not needed.
	 * 
	 * <p>It is worth noting that this extension does not address automatic synchronization between CPU and GPU when both entities operate on the same texture at
	 * the same time. This is up to the application to assure such synchronization. Otherwise, the results may not be deterministic (writes from different
	 * entities may interleave in a non-deterministic way).</p>
	 *
	 * @param texture the texture to synchronize
	 */
	public static void glSyncTextureINTEL(int texture) {
		long __functionAddress = GL.getCapabilities().glSyncTextureINTEL;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture);
	}

	// --- [ glUnmapTexture2DINTEL ] ---

	/**
	 * Releases the pointer obtained previously via {@link #glMapTexture2DINTEL MapTexture2DINTEL}. This means that virtual memory space dedicated to make the texture available via a
	 * pointer is released and an application can no longer assume this memory is accessible from CPU. Successful execution of this command has an additional
	 * effect as if {@link #glSyncTextureINTEL SyncTextureINTEL} was called with {@code texture} parameter.
	 *
	 * @param texture the texture to unmap
	 * @param level   the mipmap level-of-detail of the texture
	 */
	public static void glUnmapTexture2DINTEL(int texture, int level) {
		long __functionAddress = GL.getCapabilities().glUnmapTexture2DINTEL;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, level);
	}

	// --- [ glMapTexture2DINTEL ] ---

	/**
	 * Attempts to return a direct pointer to the graphics storage for 2D texture indicated by the {@code texture} parameter.
	 * 
	 * <p><b>LWJGL note</b>: If glMapTexture2DINTEL without an explicit length argument is used and direct-state-access functionality is not available in the
	 * current context, the texture object must currently be bound to the GL_TEXTURE_2D target.</p>
	 *
	 * @param texture the texture to map
	 * @param level   the mipmap level-of-detail of the texture
	 * @param access  the type of access that will be performed by the application. One of:<br><table><tr><td>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td></tr></table>
	 * @param stride  returns the distance in bytes between subsequent rows in the texture
	 * @param layout  returns the internal layout of the texture in the graphics memory
	 */
	public static long nglMapTexture2DINTEL(int texture, int level, int access, long stride, long layout) {
		long __functionAddress = GL.getCapabilities().glMapTexture2DINTEL;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPPP(__functionAddress, texture, level, access, stride, layout);
	}

	/**
	 * Attempts to return a direct pointer to the graphics storage for 2D texture indicated by the {@code texture} parameter.
	 * 
	 * <p><b>LWJGL note</b>: If glMapTexture2DINTEL without an explicit length argument is used and direct-state-access functionality is not available in the
	 * current context, the texture object must currently be bound to the GL_TEXTURE_2D target.</p>
	 *
	 * @param texture the texture to map
	 * @param level   the mipmap level-of-detail of the texture
	 * @param access  the type of access that will be performed by the application. One of:<br><table><tr><td>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td></tr></table>
	 * @param stride  returns the distance in bytes between subsequent rows in the texture
	 * @param layout  returns the internal layout of the texture in the graphics memory
	 */
	public static ByteBuffer glMapTexture2DINTEL(int texture, int level, int access, IntBuffer stride, IntBuffer layout) {
		if ( CHECKS ) {
			checkBuffer(stride, 1);
			checkBuffer(layout, 1);
		}
		long __result = nglMapTexture2DINTEL(texture, level, access, memAddress(stride), memAddress(layout));
		return memByteBuffer(__result, getStride(stride) * GLChecks.getTexLevelParameteri(texture, GL11.GL_TEXTURE_2D, level, GL11.GL_TEXTURE_HEIGHT));
	}

	/**
	 * Attempts to return a direct pointer to the graphics storage for 2D texture indicated by the {@code texture} parameter.
	 * 
	 * <p><b>LWJGL note</b>: If glMapTexture2DINTEL without an explicit length argument is used and direct-state-access functionality is not available in the
	 * current context, the texture object must currently be bound to the GL_TEXTURE_2D target.</p>
	 *
	 * @param texture the texture to map
	 * @param level   the mipmap level-of-detail of the texture
	 * @param access  the type of access that will be performed by the application. One of:<br><table><tr><td>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td></tr></table>
	 * @param stride  returns the distance in bytes between subsequent rows in the texture
	 * @param layout  returns the internal layout of the texture in the graphics memory
	 */
	public static ByteBuffer glMapTexture2DINTEL(int texture, int level, int access, IntBuffer stride, IntBuffer layout, ByteBuffer old_buffer) {
		if ( CHECKS ) {
			checkBuffer(stride, 1);
			checkBuffer(layout, 1);
		}
		long __result = nglMapTexture2DINTEL(texture, level, access, memAddress(stride), memAddress(layout));
		int length = getStride(stride) * GLChecks.getTexLevelParameteri(texture, GL11.GL_TEXTURE_2D, level, GL11.GL_TEXTURE_HEIGHT);
		return old_buffer == null ? memByteBuffer(__result, length) : memSetupBuffer(old_buffer, __result, length);
	}

	/**
	 * Attempts to return a direct pointer to the graphics storage for 2D texture indicated by the {@code texture} parameter.
	 * 
	 * <p><b>LWJGL note</b>: If glMapTexture2DINTEL without an explicit length argument is used and direct-state-access functionality is not available in the
	 * current context, the texture object must currently be bound to the GL_TEXTURE_2D target.</p>
	 *
	 * @param texture the texture to map
	 * @param level   the mipmap level-of-detail of the texture
	 * @param access  the type of access that will be performed by the application. One of:<br><table><tr><td>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td></tr></table>
	 * @param stride  returns the distance in bytes between subsequent rows in the texture
	 * @param layout  returns the internal layout of the texture in the graphics memory
	 */
	public static ByteBuffer glMapTexture2DINTEL(int texture, int level, int access, IntBuffer stride, IntBuffer layout, long length, ByteBuffer old_buffer) {
		if ( CHECKS ) {
			checkBuffer(stride, 1);
			checkBuffer(layout, 1);
		}
		long __result = nglMapTexture2DINTEL(texture, level, access, memAddress(stride), memAddress(layout));
		return old_buffer == null ? memByteBuffer(__result, (int)length) : memSetupBuffer(old_buffer, __result, (int)length);
	}

	/** Array version of: {@link #glMapTexture2DINTEL MapTexture2DINTEL} */
	public static ByteBuffer glMapTexture2DINTEL(int texture, int level, int access, int[] stride, int[] layout) {
		long __functionAddress = GL.getCapabilities().glMapTexture2DINTEL;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(stride, 1);
			checkBuffer(layout, 1);
		}
		long __result = callPPP(__functionAddress, texture, level, access, stride, layout);
		return memByteBuffer(__result, getStride(stride) * GLChecks.getTexLevelParameteri(texture, GL11.GL_TEXTURE_2D, level, GL11.GL_TEXTURE_HEIGHT));
	}

	/** Array version of: {@link #glMapTexture2DINTEL MapTexture2DINTEL} */
	public static ByteBuffer glMapTexture2DINTEL(int texture, int level, int access, int[] stride, int[] layout, ByteBuffer old_buffer) {
		long __functionAddress = GL.getCapabilities().glMapTexture2DINTEL;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(stride, 1);
			checkBuffer(layout, 1);
		}
		long __result = callPPP(__functionAddress, texture, level, access, stride, layout);
		int length = getStride(stride) * GLChecks.getTexLevelParameteri(texture, GL11.GL_TEXTURE_2D, level, GL11.GL_TEXTURE_HEIGHT);
		return old_buffer == null ? memByteBuffer(__result, length) : memSetupBuffer(old_buffer, __result, length);
	}

	/** Array version of: {@link #glMapTexture2DINTEL MapTexture2DINTEL} */
	public static ByteBuffer glMapTexture2DINTEL(int texture, int level, int access, int[] stride, int[] layout, long length, ByteBuffer old_buffer) {
		long __functionAddress = GL.getCapabilities().glMapTexture2DINTEL;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(stride, 1);
			checkBuffer(layout, 1);
		}
		long __result = callPPP(__functionAddress, texture, level, access, stride, layout);
		return old_buffer == null ? memByteBuffer(__result, (int)length) : memSetupBuffer(old_buffer, __result, (int)length);
	}

	private static int getStride(IntBuffer stride) {
		return stride.get(stride.position());
	}

	private static int getStride(int[] stride) {
		return stride[0];
	}

}