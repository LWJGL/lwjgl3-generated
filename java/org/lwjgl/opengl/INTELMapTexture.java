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
public final class INTELMapTexture {

	/** Accepted by the {@code pname} parameter of TexParameteri, for target TEXTURE_2D. */
	public static final int GL_TEXTURE_MEMORY_LAYOUT_INTEL = 0x83FF;

	/** Accepted by the {@code params} when {@code pname} is set to {@code TEXTURE_MEMORY_LAYOUT_INTEL}. */
	public static final int
		GL_LAYOUT_DEFAULT_INTEL           = 0x0,
		GL_LAYOUT_LINEAR_INTEL            = 0x1,
		GL_LAYOUT_LINEAR_CPU_CACHED_INTEL = 0x2;

	/** Function address. */
	@JavadocExclude
	public final long
		SyncTextureINTEL,
		UnmapTexture2DINTEL,
		MapTexture2DINTEL;

	@JavadocExclude
	public INTELMapTexture(FunctionProvider provider) {
		SyncTextureINTEL = provider.getFunctionAddress("glSyncTextureINTEL");
		UnmapTexture2DINTEL = provider.getFunctionAddress("glUnmapTexture2DINTEL");
		MapTexture2DINTEL = provider.getFunctionAddress("glMapTexture2DINTEL");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link INTELMapTexture} instance for the current context. */
	public static INTELMapTexture getInstance() {
		return checkFunctionality(GL.getCapabilities().__INTELMapTexture);
	}

	static INTELMapTexture create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_INTEL_map_texture") ) return null;

		INTELMapTexture funcs = new INTELMapTexture(provider);

		boolean supported = checkFunctions(
			funcs.SyncTextureINTEL, funcs.UnmapTexture2DINTEL, funcs.MapTexture2DINTEL
		);

		return GL.checkExtension("GL_INTEL_map_texture", funcs, supported);
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
		long __functionAddress = getInstance().SyncTextureINTEL;
		callIV(__functionAddress, texture);
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
		long __functionAddress = getInstance().UnmapTexture2DINTEL;
		callIIV(__functionAddress, texture, level);
	}

	// --- [ glMapTexture2DINTEL ] ---

	/** Unsafe version of {@link #glMapTexture2DINTEL MapTexture2DINTEL} */
	@JavadocExclude
	public static long nglMapTexture2DINTEL(int texture, int level, int access, long stride, long layout) {
		long __functionAddress = getInstance().MapTexture2DINTEL;
		return callIIIPPP(__functionAddress, texture, level, access, stride, layout);
	}

	/**
	 * Attempts to return a direct pointer to the graphics storage for 2D texture indicated by the {@code texture} parameter.
	 * 
	 * <p><b>LWJGL note</b>: If glMapTexture2DINTEL without an explicit length argument is used and direct-state-access functionality is not available in the
	 * current context, the texture object must currently be bound to the GL_TEXTURE_2D target.</p>
	 *
	 * @param texture the texture to map
	 * @param level   the mipmap level-of-detail of the texture
	 * @param access  the type of access that will be performed by the application. One of:<br>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT}, {@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}
	 * @param stride  returns the distance in bytes between subsequent rows in the texture
	 * @param layout  returns the internal layout of the texture in the graphics memory
	 */
	public static ByteBuffer glMapTexture2DINTEL(int texture, int level, int access, ByteBuffer stride, ByteBuffer layout) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(stride, 1 << 2);
			checkBuffer(layout, 1 << 2);
		}
		long __result = nglMapTexture2DINTEL(texture, level, access, memAddress(stride), memAddress(layout));
		return memByteBuffer(__result, memGetInt(memAddress(stride)) * GLChecks.getTexLevelParameteri(texture, GL11.GL_TEXTURE_2D, level, GL11.GL_TEXTURE_HEIGHT));
	}

	/** Alternative version of: {@link #glMapTexture2DINTEL MapTexture2DINTEL} */
	public static ByteBuffer glMapTexture2DINTEL(int texture, int level, int access, IntBuffer stride, IntBuffer layout, ByteBuffer old_buffer) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(stride, 1);
			checkBuffer(layout, 1);
		}
		long __result = nglMapTexture2DINTEL(texture, level, access, memAddress(stride), memAddress(layout));
		int length = memGetInt(memAddress(stride)) * GLChecks.getTexLevelParameteri(texture, GL11.GL_TEXTURE_2D, level, GL11.GL_TEXTURE_HEIGHT);
		return old_buffer == null ? memByteBuffer(__result, length) : memSetupBuffer(old_buffer, __result, length);
	}

	/** Explicit size alternative version of: {@link #glMapTexture2DINTEL MapTexture2DINTEL} */
	public static ByteBuffer glMapTexture2DINTEL(int texture, int level, int access, IntBuffer stride, IntBuffer layout, long length, ByteBuffer old_buffer) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(stride, 1);
			checkBuffer(layout, 1);
		}
		long __result = nglMapTexture2DINTEL(texture, level, access, memAddress(stride), memAddress(layout));
		return old_buffer == null ? memByteBuffer(__result, (int)length) : memSetupBuffer(old_buffer, __result, (int)length);
	}

}