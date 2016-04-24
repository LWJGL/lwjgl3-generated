/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/x11_sync_object.txt">EXT_x11_sync_object</a> extension.
 * 
 * <p>Synchronization objects added the ability to better coordinate operations between multiple GL command streams. However, it is desirable to have the
 * same level of coordination between GL command streams and external rendering APIs. This extension introduces two new concepts to build upon the
 * synchronization infrastructure provided by {@link ARBSync ARB_sync}:</p>
 * 
 * <ol>
 * <li>A means to import an X Synchronization Fence object into the GL and use it as a sync object.</li>
 * <li>The concept of a reusable sync object.</li>
 * </ol>
 * 
 * <p>The latter is necessary because the import operation is expensive and performing it every time a synchronization point was reached would make the
 * synchronization prohibitively slow.</p>
 * 
 * <p>This extension stops short of allowing the GL to change the state of imported/reusable sync objects, but does not add any language that would prohibit
 * such functionality from being added in a subsequent extension.</p>
 * 
 * <p>Requires {@link GL32 OpenGL 3.2} or {@link ARBSync ARB_sync}.</p>
 */
public class EXTX11SyncObject {

	/** Accepted by the {@code external_sync_type} parameter of ImportSyncEXT. */
	public static final int GL_SYNC_X11_FENCE_EXT = 0x90E1;

	protected EXTX11SyncObject() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glImportSyncEXT
		);
	}

	// --- [ glImportSyncEXT ] ---

	/**
	 * Creates a GL sync object of the type {@code external_sync_type} based on the object referred to by {@code external_sync}.
	 *
	 * @param external_sync_type the external sync object type. Must be:<br><table><tr><td>{@link #GL_SYNC_X11_FENCE_EXT SYNC_X11_FENCE_EXT}</td></tr></table>
	 * @param external_sync      the external sync object. Must be the XID of a valid X11 Synchronization Fence object
	 * @param flags              Must be 0.
	 */
	public static long glImportSyncEXT(int external_sync_type, long external_sync, int flags) {
		long __functionAddress = GL.getCapabilities().glImportSyncEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPP(__functionAddress, external_sync_type, external_sync, flags);
	}

}