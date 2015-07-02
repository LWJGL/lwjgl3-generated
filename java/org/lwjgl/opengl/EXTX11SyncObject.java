/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/x11_sync_object.txt">EXT_x11_sync_object</a> extension.
 * 
 * <p>Synchronization objects added the ability to better coordinate operations between multiple GL command streams. However, it is desirable to have the
 * same level of coordination between GL command streams and external rendering APIs. This extension introduces two new concepts to build upon the
 * synchronization infrastructure provided by {@link ARBSync ARB_sync}:
 * <ol>
 * <li>A means to import an X Synchronization Fence object into the GL and use it as a sync object.</li>
 * <li>The concept of a reusable sync object.</li>
 * </ol>
 * The latter is necessary because the import operation is expensive and performing it every time a synchronization point was reached would make the
 * synchronization prohibitively slow.</p>
 * 
 * <p>This extension stops short of allowing the GL to change the state of imported/reusable sync objects, but does not add any language that would prohibit
 * such functionality from being added in a subsequent extension.</p>
 * 
 * <p>Requires {@link GL32 OpenGL 3.2} or {@link ARBSync ARB_sync}.</p>
 */
public final class EXTX11SyncObject {

	/** Accepted by the {@code external_sync_type} parameter of ImportSyncEXT. */
	public static final int GL_SYNC_X11_FENCE_EXT = 0x90E1;

	/** Function address. */
	@JavadocExclude
	public final long ImportSyncEXT;

	@JavadocExclude
	public EXTX11SyncObject(FunctionProvider provider) {
		ImportSyncEXT = provider.getFunctionAddress("glImportSyncEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTX11SyncObject} instance for the current context. */
	public static EXTX11SyncObject getInstance() {
		return checkFunctionality(GL.getCapabilities().__EXTX11SyncObject);
	}

	static EXTX11SyncObject create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_x11_sync_object") ) return null;

		EXTX11SyncObject funcs = new EXTX11SyncObject(provider);

		boolean supported = checkFunctions(
			funcs.ImportSyncEXT
		);

		return GL.checkExtension("GL_EXT_x11_sync_object", funcs, supported);
	}

	// --- [ glImportSyncEXT ] ---

	/** JNI method for {@link #glImportSyncEXT ImportSyncEXT} */
	@JavadocExclude
	public static native long nglImportSyncEXT(int external_sync_type, long external_sync, int flags, long __functionAddress);

	/**
	 * Creates a GL sync object of the type {@code external_sync_type} based on the object referred to by {@code external_sync}.
	 *
	 * @param external_sync_type the external sync object type. Must be:<br>{@link #GL_SYNC_X11_FENCE_EXT SYNC_X11_FENCE_EXT}
	 * @param external_sync      the external sync object. Must be the XID of a valid X11 Synchronization Fence object
	 * @param flags              Must be 0.
	 */
	public static long glImportSyncEXT(int external_sync_type, long external_sync, int flags) {
		long __functionAddress = getInstance().ImportSyncEXT;
		return nglImportSyncEXT(external_sync_type, external_sync, flags, __functionAddress);
	}

}