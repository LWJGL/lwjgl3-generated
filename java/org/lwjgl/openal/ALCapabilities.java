/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.system.*;
import java.util.Set;

/** Defines the capabilities of an OpenAL context. */
public final class ALCapabilities {

	final AL10                __AL10;
	final AL11                __AL11;
	final EXTEfx              __EXTEfx;
	final SOFTBufferSamples   __SOFTBufferSamples;
	final SOFTBufferSubData   __SOFTBufferSubData;
	final SOFTDeferredUpdates __SOFTDeferredUpdates;
	final SOFTSourceLatency   __SOFTSourceLatency;

	/** Indicates whether an OpenAL functionality is available or not. */
	public final boolean
		OpenAL10,
		OpenAL11,
		AL_EXT_ALAW,
		AL_EXT_DOUBLE,
		AL_EXT_EXPONENT_DISTANCE,
		AL_EXT_FLOAT32,
		AL_EXT_IMA4,
		AL_EXT_LINEAR_DISTANCE,
		AL_EXT_MCFORMATS,
		AL_EXT_MULAW,
		AL_EXT_MULAW_MCFORMATS,
		AL_EXT_OFFSET,
		AL_EXT_source_distance_model,
		AL_LOKI_quadriphonic,
		AL_SOFT_block_alignment,
		AL_SOFT_buffer_samples,
		AL_SOFT_buffer_sub_data,
		AL_SOFT_deferred_updates,
		AL_SOFT_direct_channels,
		AL_SOFT_loop_points,
		AL_SOFT_MSADPCM,
		AL_SOFT_source_latency,
		AL_SOFT_source_length;

	ALCapabilities(FunctionProvider provider, Set<String> ext) {
		OpenAL10 = (__AL10 = AL10.create(ext, provider)) != null;
		OpenAL11 = (__AL11 = AL11.create(ext, provider)) != null;
		AL_EXT_ALAW = ext.contains("AL_EXT_ALAW");
		AL_EXT_DOUBLE = ext.contains("AL_EXT_DOUBLE");
		if ( ALC.getCapabilities().ALC_EXT_EFX )
			ext.add("ALC_EXT_EFX");
		__EXTEfx = EXTEfx.create(ext, provider);
		AL_EXT_EXPONENT_DISTANCE = ext.contains("AL_EXT_EXPONENT_DISTANCE");
		AL_EXT_FLOAT32 = ext.contains("AL_EXT_FLOAT32");
		AL_EXT_IMA4 = ext.contains("AL_EXT_IMA4");
		AL_EXT_LINEAR_DISTANCE = ext.contains("AL_EXT_LINEAR_DISTANCE");
		AL_EXT_MCFORMATS = ext.contains("AL_EXT_MCFORMATS");
		AL_EXT_MULAW = ext.contains("AL_EXT_MULAW");
		AL_EXT_MULAW_MCFORMATS = ext.contains("AL_EXT_MULAW_MCFORMATS");
		AL_EXT_OFFSET = ext.contains("AL_EXT_OFFSET");
		AL_EXT_source_distance_model = ext.contains("AL_EXT_source_distance_model");
		AL_LOKI_quadriphonic = ext.contains("AL_LOKI_quadriphonic");
		AL_SOFT_block_alignment = ext.contains("AL_SOFT_block_alignment");
		AL_SOFT_buffer_samples = (__SOFTBufferSamples = SOFTBufferSamples.create(ext, provider)) != null;
		AL_SOFT_buffer_sub_data = (__SOFTBufferSubData = SOFTBufferSubData.create(ext, provider)) != null;
		AL_SOFT_deferred_updates = (__SOFTDeferredUpdates = SOFTDeferredUpdates.create(ext, provider)) != null;
		AL_SOFT_direct_channels = ext.contains("AL_SOFT_direct_channels");
		AL_SOFT_loop_points = ext.contains("AL_SOFT_loop_points");
		AL_SOFT_MSADPCM = ext.contains("AL_SOFT_MSADPCM");
		AL_SOFT_source_latency = (__SOFTSourceLatency = SOFTSourceLatency.create(ext, provider)) != null;
		AL_SOFT_source_length = ext.contains("AL_SOFT_source_length");
	}
}