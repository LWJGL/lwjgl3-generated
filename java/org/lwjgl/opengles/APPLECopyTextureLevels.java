/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/APPLE/APPLE_copy_texture_levels.txt">APPLE_copy_texture_levels</a> extension.
 * 
 * <p>This extension provides an efficient path for copying a contiguous subset of mipmap levels from one texture to the matching subset of mipmap levels of
 * another texture, where matches are determined by the equality of a level's dimensions.</p>
 * 
 * <p>This extension is dependent on the existence of the extension EXT_texture_storage. Immutable textures are used to guarantee that storage is allocated
 * up front for the source and destination textures and that the internal formats of those textures are sized the same.</p>
 * 
 * <p>An efficient copy can be achieved by implementations because the internal storage requirements are the same between textures and will remain unchanged
 * when moving data. It is expected that in all cases, moving levels from one texture to another is a simple copy operation without any necessary
 * conversion. This extension can be used as an alternative to TEXTURE_BASE_LEVEL. In some implementations, changing the value of TEXTURE_BASE_LEVEL can
 * incur a costly re-allocation at runtime.</p>
 * 
 * <p>Texture streaming is an expected use case for this extension. For example, a developer may want to stream in a larger base level for a given texture
 * from a storage device. To achieve this, a copy of the current mipmap levels are made into a destination whose storage was specified to accommodate the
 * source levels and the larger base level. The efficiency of the copy without conversion allows for the smaller mipmap levels to be in place while the
 * larger base level is being read from the storage device and uploaded.</p>
 * 
 * <p>Requires {@link GLES20 GLES E.S} and {@link EXTTextureStorage EXT_texture_storage}.</p>
 */
public final class APPLECopyTextureLevels {

	/** Function address. */
	@JavadocExclude
	public final long CopyTextureLevelsAPPLE;

	@JavadocExclude
	public APPLECopyTextureLevels(FunctionProvider provider) {
		CopyTextureLevelsAPPLE = provider.getFunctionAddress("glCopyTextureLevelsAPPLE");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link APPLECopyTextureLevels} instance for the current context. */
	public static APPLECopyTextureLevels getInstance() {
		return checkFunctionality(GLES.getCapabilities().__APPLECopyTextureLevels);
	}

	static APPLECopyTextureLevels create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_APPLE_copy_texture_levels") ) return null;

		APPLECopyTextureLevels funcs = new APPLECopyTextureLevels(provider);
		boolean supported = checkFunctions(
			funcs.CopyTextureLevelsAPPLE
		);

		return GLES.checkExtension("GL_APPLE_copy_texture_levels", funcs, supported);
	}

	// --- [ glCopyTextureLevelsAPPLE ] ---

	public static void glCopyTextureLevelsAPPLE(int destinationTexture, int sourceTexture, int sourceBaseLevel, int sourceLevelCount) {
		long __functionAddress = getInstance().CopyTextureLevelsAPPLE;
		callIIIIV(__functionAddress, destinationTexture, sourceTexture, sourceBaseLevel, sourceLevelCount);
	}

}