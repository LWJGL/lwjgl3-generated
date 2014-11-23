/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.system.*;
import java.util.Set;

/** Defines the capabilities of the OpenAL Context API. */
public final class ALCCapabilities {

	final ALC10                 __ALC10;
	final ALC11                 __ALC11;
	final EXTThreadLocalContext __EXTThreadLocalContext;
	final SOFTLoopback          __SOFTLoopback;
	final SOFTPauseDevice       __SOFTPauseDevice;

	/** Indicates whether an ALC functionality is available or not. */
	public final boolean
		OpenALC10,
		OpenALC11,
		ALC_ENUMERATE_ALL_EXT,
		ALC_ENUMERATION_EXT,
		ALC_EXT_DEDICATED,
		ALC_EXT_disconnect,
		ALC_EXT_EFX,
		ALC_EXT_thread_local_context,
		ALC_SOFT_loopback,
		ALC_SOFT_pause_device;

	ALCCapabilities(FunctionProviderLocal provider, long device, Set<String> ext) {
		OpenALC10 = (__ALC10 = ALC10.create(ext, provider)) != null;
		OpenALC11 = (__ALC11 = ALC11.create(ext, provider)) != null;
		ALC_ENUMERATE_ALL_EXT = ext.contains("ALC_ENUMERATE_ALL_EXT");
		ALC_ENUMERATION_EXT = ext.contains("ALC_ENUMERATION_EXT");
		ALC_EXT_DEDICATED = ext.contains("ALC_EXT_DEDICATED");
		ALC_EXT_disconnect = ext.contains("ALC_EXT_disconnect");
		ALC_EXT_EFX = ext.contains("ALC_EXT_EFX");
		ALC_EXT_thread_local_context = (__EXTThreadLocalContext = EXTThreadLocalContext.create(ext, provider, device)) != null;
		ALC_SOFT_loopback = (__SOFTLoopback = SOFTLoopback.create(ext, provider, device)) != null;
		ALC_SOFT_pause_device = (__SOFTPauseDevice = SOFTPauseDevice.create(ext, provider, device)) != null;
	}
}