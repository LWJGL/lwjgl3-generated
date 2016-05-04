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

	public final long
		alAuxiliaryEffectSlotf,
		alAuxiliaryEffectSlotfv,
		alAuxiliaryEffectSloti,
		alAuxiliaryEffectSlotiv,
		alBuffer3f,
		alBuffer3i,
		alBufferData,
		alBufferDataStatic,
		alBufferf,
		alBufferfv,
		alBufferi,
		alBufferiv,
		alDeferUpdatesSOFT,
		alDeleteAuxiliaryEffectSlots,
		alDeleteBuffers,
		alDeleteEffects,
		alDeleteFilters,
		alDeleteSources,
		alDisable,
		alDistanceModel,
		alDopplerFactor,
		alDopplerVelocity,
		alEffectf,
		alEffectfv,
		alEffecti,
		alEffectiv,
		alEnable,
		alFilterf,
		alFilterfv,
		alFilteri,
		alFilteriv,
		alGenAuxiliaryEffectSlots,
		alGenBuffers,
		alGenEffects,
		alGenFilters,
		alGenSources,
		alGetAuxiliaryEffectSlotf,
		alGetAuxiliaryEffectSlotfv,
		alGetAuxiliaryEffectSloti,
		alGetAuxiliaryEffectSlotiv,
		alGetBoolean,
		alGetBooleanv,
		alGetBufferf,
		alGetBufferfv,
		alGetBufferi,
		alGetBufferiv,
		alGetDouble,
		alGetDoublev,
		alGetEffectf,
		alGetEffectfv,
		alGetEffecti,
		alGetEffectiv,
		alGetEnumValue,
		alGetError,
		alGetFilterf,
		alGetFilterfv,
		alGetFilteri,
		alGetFilteriv,
		alGetFloat,
		alGetFloatv,
		alGetInteger,
		alGetIntegerv,
		alGetListener3f,
		alGetListenerf,
		alGetListenerfv,
		alGetListeneri,
		alGetListeneriv,
		alGetProcAddress,
		alGetSource3dSOFT,
		alGetSource3f,
		alGetSource3i64SOFT,
		alGetSourcedSOFT,
		alGetSourcedvSOFT,
		alGetSourcef,
		alGetSourcefv,
		alGetSourcei,
		alGetSourcei64SOFT,
		alGetSourcei64vSOFT,
		alGetSourceiv,
		alGetString,
		alIsAuxiliaryEffectSlot,
		alIsBuffer,
		alIsEffect,
		alIsEnabled,
		alIsExtensionPresent,
		alIsFilter,
		alIsSource,
		alListener3f,
		alListener3i,
		alListenerf,
		alListenerfv,
		alListeneri,
		alListeneriv,
		alProcessUpdatesSOFT,
		alSource3dSOFT,
		alSource3f,
		alSource3i,
		alSource3i64SOFT,
		alSourcePause,
		alSourcePausev,
		alSourcePlay,
		alSourcePlayv,
		alSourceQueueBuffers,
		alSourceRewind,
		alSourceRewindv,
		alSourceStop,
		alSourceStopv,
		alSourceUnqueueBuffers,
		alSourcedSOFT,
		alSourcedvSOFT,
		alSourcef,
		alSourcefv,
		alSourcei,
		alSourcei64SOFT,
		alSourcei64vSOFT,
		alSourceiv,
		alSpeedOfSound;

	/** When true, {@link AL10} is supported. */
	public final boolean OpenAL10;
	/** When true, {@link AL11} is supported. */
	public final boolean OpenAL11;
	/** When true, {@link EXTAlaw} is supported. */
	public final boolean AL_EXT_ALAW;
	/** When true, {@link EXTBFormat} is supported. */
	public final boolean AL_EXT_BFORMAT;
	/** When true, {@link EXTDouble} is supported. */
	public final boolean AL_EXT_DOUBLE;
	/** When true, {@link EXTEfx} is supported. */
	public final boolean ALC_EXT_EFX;
	/** When true, {@link EXTExponentDistance} is supported. */
	public final boolean AL_EXT_EXPONENT_DISTANCE;
	/** When true, {@link EXTFloat32} is supported. */
	public final boolean AL_EXT_FLOAT32;
	/** When true, {@link EXTIma4} is supported. */
	public final boolean AL_EXT_IMA4;
	/** When true, {@link EXTLinearDistance} is supported. */
	public final boolean AL_EXT_LINEAR_DISTANCE;
	/** When true, {@link EXTMCFormats} is supported. */
	public final boolean AL_EXT_MCFORMATS;
	/** When true, {@link EXTMulaw} is supported. */
	public final boolean AL_EXT_MULAW;
	/** When true, {@link EXTMulawBFormat} is supported. */
	public final boolean AL_EXT_MULAW_BFORMAT;
	/** When true, {@link EXTMulawMCFormats} is supported. */
	public final boolean AL_EXT_MULAW_MCFORMATS;
	/** When true, {@link EXTOffset} is supported. */
	public final boolean AL_EXT_OFFSET;
	/** When true, {@link EXTSourceDistanceModel} is supported. */
	public final boolean AL_EXT_source_distance_model;
	/** When true, {@link EXTSourceRadius} is supported. */
	public final boolean AL_EXT_SOURCE_RADIUS;
	/** When true, {@link EXTStaticBuffer} is supported. */
	public final boolean AL_EXT_static_buffer;
	/** When true, {@link EXTStereoAngles} is supported. */
	public final boolean AL_EXT_STEREO_ANGLES;
	/** When true, {@link EXTVorbis} is supported. */
	public final boolean AL_EXT_vorbis;
	/** When true, {@link LOKIIMAADPCM} is supported. */
	public final boolean AL_LOKI_IMA_ADPCM;
	/** When true, {@link LOKIQuadriphonic} is supported. */
	public final boolean AL_LOKI_quadriphonic;
	/** When true, {@link LOKIWAVEFormat} is supported. */
	public final boolean AL_LOKI_WAVE_format;
	/** When true, {@link SOFTBlockAlignment} is supported. */
	public final boolean AL_SOFT_block_alignment;
	/** When true, {@link SOFTDeferredUpdates} is supported. */
	public final boolean AL_SOFT_deferred_updates;
	/** When true, {@link SOFTDirectChannels} is supported. */
	public final boolean AL_SOFT_direct_channels;
	/** When true, {@link SOFTLoopPoints} is supported. */
	public final boolean AL_SOFT_loop_points;
	/** When true, {@link SOFTMSADPCM} is supported. */
	public final boolean AL_SOFT_MSADPCM;
	/** When true, {@link SOFTSourceLatency} is supported. */
	public final boolean AL_SOFT_source_latency;
	/** When true, {@link SOFTSourceLength} is supported. */
	public final boolean AL_SOFT_source_length;

	ALCapabilities(FunctionProvider provider, Set<String> ext) {
		alAuxiliaryEffectSlotf = provider.getFunctionAddress("alAuxiliaryEffectSlotf");
		alAuxiliaryEffectSlotfv = provider.getFunctionAddress("alAuxiliaryEffectSlotfv");
		alAuxiliaryEffectSloti = provider.getFunctionAddress("alAuxiliaryEffectSloti");
		alAuxiliaryEffectSlotiv = provider.getFunctionAddress("alAuxiliaryEffectSlotiv");
		alBuffer3f = provider.getFunctionAddress("alBuffer3f");
		alBuffer3i = provider.getFunctionAddress("alBuffer3i");
		alBufferData = provider.getFunctionAddress("alBufferData");
		alBufferDataStatic = provider.getFunctionAddress("alBufferDataStatic");
		alBufferf = provider.getFunctionAddress("alBufferf");
		alBufferfv = provider.getFunctionAddress("alBufferfv");
		alBufferi = provider.getFunctionAddress("alBufferi");
		alBufferiv = provider.getFunctionAddress("alBufferiv");
		alDeferUpdatesSOFT = provider.getFunctionAddress("alDeferUpdatesSOFT");
		alDeleteAuxiliaryEffectSlots = provider.getFunctionAddress("alDeleteAuxiliaryEffectSlots");
		alDeleteBuffers = provider.getFunctionAddress("alDeleteBuffers");
		alDeleteEffects = provider.getFunctionAddress("alDeleteEffects");
		alDeleteFilters = provider.getFunctionAddress("alDeleteFilters");
		alDeleteSources = provider.getFunctionAddress("alDeleteSources");
		alDisable = provider.getFunctionAddress("alDisable");
		alDistanceModel = provider.getFunctionAddress("alDistanceModel");
		alDopplerFactor = provider.getFunctionAddress("alDopplerFactor");
		alDopplerVelocity = provider.getFunctionAddress("alDopplerVelocity");
		alEffectf = provider.getFunctionAddress("alEffectf");
		alEffectfv = provider.getFunctionAddress("alEffectfv");
		alEffecti = provider.getFunctionAddress("alEffecti");
		alEffectiv = provider.getFunctionAddress("alEffectiv");
		alEnable = provider.getFunctionAddress("alEnable");
		alFilterf = provider.getFunctionAddress("alFilterf");
		alFilterfv = provider.getFunctionAddress("alFilterfv");
		alFilteri = provider.getFunctionAddress("alFilteri");
		alFilteriv = provider.getFunctionAddress("alFilteriv");
		alGenAuxiliaryEffectSlots = provider.getFunctionAddress("alGenAuxiliaryEffectSlots");
		alGenBuffers = provider.getFunctionAddress("alGenBuffers");
		alGenEffects = provider.getFunctionAddress("alGenEffects");
		alGenFilters = provider.getFunctionAddress("alGenFilters");
		alGenSources = provider.getFunctionAddress("alGenSources");
		alGetAuxiliaryEffectSlotf = provider.getFunctionAddress("alGetAuxiliaryEffectSlotf");
		alGetAuxiliaryEffectSlotfv = provider.getFunctionAddress("alGetAuxiliaryEffectSlotfv");
		alGetAuxiliaryEffectSloti = provider.getFunctionAddress("alGetAuxiliaryEffectSloti");
		alGetAuxiliaryEffectSlotiv = provider.getFunctionAddress("alGetAuxiliaryEffectSlotiv");
		alGetBoolean = provider.getFunctionAddress("alGetBoolean");
		alGetBooleanv = provider.getFunctionAddress("alGetBooleanv");
		alGetBufferf = provider.getFunctionAddress("alGetBufferf");
		alGetBufferfv = provider.getFunctionAddress("alGetBufferfv");
		alGetBufferi = provider.getFunctionAddress("alGetBufferi");
		alGetBufferiv = provider.getFunctionAddress("alGetBufferiv");
		alGetDouble = provider.getFunctionAddress("alGetDouble");
		alGetDoublev = provider.getFunctionAddress("alGetDoublev");
		alGetEffectf = provider.getFunctionAddress("alGetEffectf");
		alGetEffectfv = provider.getFunctionAddress("alGetEffectfv");
		alGetEffecti = provider.getFunctionAddress("alGetEffecti");
		alGetEffectiv = provider.getFunctionAddress("alGetEffectiv");
		alGetEnumValue = provider.getFunctionAddress("alGetEnumValue");
		alGetError = provider.getFunctionAddress("alGetError");
		alGetFilterf = provider.getFunctionAddress("alGetFilterf");
		alGetFilterfv = provider.getFunctionAddress("alGetFilterfv");
		alGetFilteri = provider.getFunctionAddress("alGetFilteri");
		alGetFilteriv = provider.getFunctionAddress("alGetFilteriv");
		alGetFloat = provider.getFunctionAddress("alGetFloat");
		alGetFloatv = provider.getFunctionAddress("alGetFloatv");
		alGetInteger = provider.getFunctionAddress("alGetInteger");
		alGetIntegerv = provider.getFunctionAddress("alGetIntegerv");
		alGetListener3f = provider.getFunctionAddress("alGetListener3f");
		alGetListenerf = provider.getFunctionAddress("alGetListenerf");
		alGetListenerfv = provider.getFunctionAddress("alGetListenerfv");
		alGetListeneri = provider.getFunctionAddress("alGetListeneri");
		alGetListeneriv = provider.getFunctionAddress("alGetListeneriv");
		alGetProcAddress = provider.getFunctionAddress("alGetProcAddress");
		alGetSource3dSOFT = provider.getFunctionAddress("alGetSource3dSOFT");
		alGetSource3f = provider.getFunctionAddress("alGetSource3f");
		alGetSource3i64SOFT = provider.getFunctionAddress("alGetSource3i64SOFT");
		alGetSourcedSOFT = provider.getFunctionAddress("alGetSourcedSOFT");
		alGetSourcedvSOFT = provider.getFunctionAddress("alGetSourcedvSOFT");
		alGetSourcef = provider.getFunctionAddress("alGetSourcef");
		alGetSourcefv = provider.getFunctionAddress("alGetSourcefv");
		alGetSourcei = provider.getFunctionAddress("alGetSourcei");
		alGetSourcei64SOFT = provider.getFunctionAddress("alGetSourcei64SOFT");
		alGetSourcei64vSOFT = provider.getFunctionAddress("alGetSourcei64vSOFT");
		alGetSourceiv = provider.getFunctionAddress("alGetSourceiv");
		alGetString = provider.getFunctionAddress("alGetString");
		alIsAuxiliaryEffectSlot = provider.getFunctionAddress("alIsAuxiliaryEffectSlot");
		alIsBuffer = provider.getFunctionAddress("alIsBuffer");
		alIsEffect = provider.getFunctionAddress("alIsEffect");
		alIsEnabled = provider.getFunctionAddress("alIsEnabled");
		alIsExtensionPresent = provider.getFunctionAddress("alIsExtensionPresent");
		alIsFilter = provider.getFunctionAddress("alIsFilter");
		alIsSource = provider.getFunctionAddress("alIsSource");
		alListener3f = provider.getFunctionAddress("alListener3f");
		alListener3i = provider.getFunctionAddress("alListener3i");
		alListenerf = provider.getFunctionAddress("alListenerf");
		alListenerfv = provider.getFunctionAddress("alListenerfv");
		alListeneri = provider.getFunctionAddress("alListeneri");
		alListeneriv = provider.getFunctionAddress("alListeneriv");
		alProcessUpdatesSOFT = provider.getFunctionAddress("alProcessUpdatesSOFT");
		alSource3dSOFT = provider.getFunctionAddress("alSource3dSOFT");
		alSource3f = provider.getFunctionAddress("alSource3f");
		alSource3i = provider.getFunctionAddress("alSource3i");
		alSource3i64SOFT = provider.getFunctionAddress("alSource3i64SOFT");
		alSourcePause = provider.getFunctionAddress("alSourcePause");
		alSourcePausev = provider.getFunctionAddress("alSourcePausev");
		alSourcePlay = provider.getFunctionAddress("alSourcePlay");
		alSourcePlayv = provider.getFunctionAddress("alSourcePlayv");
		alSourceQueueBuffers = provider.getFunctionAddress("alSourceQueueBuffers");
		alSourceRewind = provider.getFunctionAddress("alSourceRewind");
		alSourceRewindv = provider.getFunctionAddress("alSourceRewindv");
		alSourceStop = provider.getFunctionAddress("alSourceStop");
		alSourceStopv = provider.getFunctionAddress("alSourceStopv");
		alSourceUnqueueBuffers = provider.getFunctionAddress("alSourceUnqueueBuffers");
		alSourcedSOFT = provider.getFunctionAddress("alSourcedSOFT");
		alSourcedvSOFT = provider.getFunctionAddress("alSourcedvSOFT");
		alSourcef = provider.getFunctionAddress("alSourcef");
		alSourcefv = provider.getFunctionAddress("alSourcefv");
		alSourcei = provider.getFunctionAddress("alSourcei");
		alSourcei64SOFT = provider.getFunctionAddress("alSourcei64SOFT");
		alSourcei64vSOFT = provider.getFunctionAddress("alSourcei64vSOFT");
		alSourceiv = provider.getFunctionAddress("alSourceiv");
		alSpeedOfSound = provider.getFunctionAddress("alSpeedOfSound");

		OpenAL10 = ext.contains("OpenAL10") && AL.checkExtension("OpenAL10", AL10.isAvailable(this));
		OpenAL11 = ext.contains("OpenAL11") && AL.checkExtension("OpenAL11", AL11.isAvailable(this));
		AL_EXT_ALAW = ext.contains("AL_EXT_ALAW");
		AL_EXT_BFORMAT = ext.contains("AL_EXT_BFORMAT");
		AL_EXT_DOUBLE = ext.contains("AL_EXT_DOUBLE");
		ALC_EXT_EFX = ext.contains("ALC_EXT_EFX") && AL.checkExtension("ALC_EXT_EFX", EXTEfx.isAvailable(this));
		AL_EXT_EXPONENT_DISTANCE = ext.contains("AL_EXT_EXPONENT_DISTANCE");
		AL_EXT_FLOAT32 = ext.contains("AL_EXT_FLOAT32");
		AL_EXT_IMA4 = ext.contains("AL_EXT_IMA4");
		AL_EXT_LINEAR_DISTANCE = ext.contains("AL_EXT_LINEAR_DISTANCE");
		AL_EXT_MCFORMATS = ext.contains("AL_EXT_MCFORMATS");
		AL_EXT_MULAW = ext.contains("AL_EXT_MULAW");
		AL_EXT_MULAW_BFORMAT = ext.contains("AL_EXT_MULAW_BFORMAT");
		AL_EXT_MULAW_MCFORMATS = ext.contains("AL_EXT_MULAW_MCFORMATS");
		AL_EXT_OFFSET = ext.contains("AL_EXT_OFFSET");
		AL_EXT_source_distance_model = ext.contains("AL_EXT_source_distance_model");
		AL_EXT_SOURCE_RADIUS = ext.contains("AL_EXT_SOURCE_RADIUS");
		AL_EXT_static_buffer = ext.contains("AL_EXT_static_buffer") && AL.checkExtension("AL_EXT_static_buffer", EXTStaticBuffer.isAvailable(this));
		AL_EXT_STEREO_ANGLES = ext.contains("AL_EXT_STEREO_ANGLES");
		AL_EXT_vorbis = ext.contains("AL_EXT_vorbis");
		AL_LOKI_IMA_ADPCM = ext.contains("AL_LOKI_IMA_ADPCM");
		AL_LOKI_quadriphonic = ext.contains("AL_LOKI_quadriphonic");
		AL_LOKI_WAVE_format = ext.contains("AL_LOKI_WAVE_format");
		AL_SOFT_block_alignment = ext.contains("AL_SOFT_block_alignment");
		AL_SOFT_deferred_updates = ext.contains("AL_SOFT_deferred_updates") && AL.checkExtension("AL_SOFT_deferred_updates", SOFTDeferredUpdates.isAvailable(this));
		AL_SOFT_direct_channels = ext.contains("AL_SOFT_direct_channels");
		AL_SOFT_loop_points = ext.contains("AL_SOFT_loop_points");
		AL_SOFT_MSADPCM = ext.contains("AL_SOFT_MSADPCM");
		AL_SOFT_source_latency = ext.contains("AL_SOFT_source_latency") && AL.checkExtension("AL_SOFT_source_latency", SOFTSourceLatency.isAvailable(this));
		AL_SOFT_source_length = ext.contains("AL_SOFT_source_length");
	}
}