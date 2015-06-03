/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="http://kcat.strangesoft.net/openal-extensions/SOFT_deferred_updates.txt">SOFT_deferred_updates</a> extension.
 * 
 * <p>This extension allows applications to defer playback state updates. With unextended OpenAL, the playback state would respond to changes as soon as it
 * could handle them, which makes it effectively impossible to ensure multiple changes occur at the same time without the potential of a "partial" update
 * (where one change is heard without the other). This extension provides a way to prevent state updates from occuring until they've all been done, where
 * they will all apply at once.</p>
 */
public final class SOFTDeferredUpdates {

	/** Accepted by the {@code paramName} parameter of alGetBoolean, alGetBooleanv (as well as the Integer, Float, and Double variants). */
	public static final int AL_DEFERRED_UPDATES_SOFT = 0xC002;

	/** Function address. */
	@JavadocExclude
	public final long
		DeferUpdatesSOFT,
		ProcessUpdatesSOFT;

	@JavadocExclude
	public SOFTDeferredUpdates(FunctionProvider provider) {
		DeferUpdatesSOFT = provider.getFunctionAddress("alDeferUpdatesSOFT");
		ProcessUpdatesSOFT = provider.getFunctionAddress("alProcessUpdatesSOFT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link SOFTDeferredUpdates} instance for the current context. */
	public static SOFTDeferredUpdates getInstance() {
		return checkFunctionality(AL.getCapabilities().__SOFTDeferredUpdates);
	}

	static SOFTDeferredUpdates create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("AL_SOFT_deferred_updates") ) return null;

		SOFTDeferredUpdates funcs = new SOFTDeferredUpdates(provider);

		boolean supported = checkFunctions(
			funcs.DeferUpdatesSOFT, funcs.ProcessUpdatesSOFT
		);

		return AL.checkExtension("AL_SOFT_deferred_updates", funcs, supported);
	}

	// --- [ alDeferUpdatesSOFT ] ---

	/** JNI method for {@link #alDeferUpdatesSOFT DeferUpdatesSOFT} */
	@JavadocExclude
	public static native void nalDeferUpdatesSOFT(long __functionAddress);

	/**
	 * Sometimes it is desirable to ensure multiple state changes take effect at the same time. Normally this isn't possible due to the AL processing updates
	 * asychronously, so the playback state can be updated with only part of the changes having been specified. An application can prevent these updates by
	 * calling this function.
	 * 
	 * <p>When called, samples will continue to render and be sent to the output device, but the effects of changing playback properties, such as the source or
	 * listener gain, or auxiliary slot gain or effect if EFX is supported, among others, will be deferred. Multiple changes can be batched so that they all
	 * apply at once at a later time.</p>
	 */
	public static void alDeferUpdatesSOFT() {
		long __functionAddress = getInstance().DeferUpdatesSOFT;
		nalDeferUpdatesSOFT(__functionAddress);
	}

	// --- [ alProcessUpdatesSOFT ] ---

	/** JNI method for {@link #alProcessUpdatesSOFT ProcessUpdatesSOFT} */
	@JavadocExclude
	public static native void nalProcessUpdatesSOFT(long __functionAddress);

	/**
	 * Resumes updates.
	 * 
	 * <p>Once called, all pending deferred updates will be processed. Any following state changes will also apply as normal.</p>
	 */
	public static void alProcessUpdatesSOFT() {
		long __functionAddress = getInstance().ProcessUpdatesSOFT;
		nalProcessUpdatesSOFT(__functionAddress);
	}

}