/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the {@code ALC_EXT_EFX} extension.
 * 
 * <p>The Effects Extension is designed to provide a generic, cross-platform framework for adding advanced DSP effects to OpenAL.</p>
 */
public class EXTEfx {

	/** ALC tokens. */
	public static final int
		ALC_EFX_MAJOR_VERSION   = 0x20001,
		ALC_EFX_MINOR_VERSION   = 0x20002,
		ALC_MAX_AUXILIARY_SENDS = 0x20003;

	/** Listener properties. */
	public static final int AL_METERS_PER_UNIT  = 0x20004;

	/** Source properties. */
	public static final int
		AL_DIRECT_FILTER                     = 0x20005,
		AL_AUXILIARY_SEND_FILTER             = 0x20006,
		AL_AIR_ABSORPTION_FACTOR             = 0x20007,
		AL_ROOM_ROLLOFF_FACTOR               = 0x20008,
		AL_CONE_OUTER_GAINHF                 = 0x20009,
		AL_DIRECT_FILTER_GAINHF_AUTO         = 0x2000A,
		AL_AUXILIARY_SEND_FILTER_GAIN_AUTO   = 0x2000B,
		AL_AUXILIARY_SEND_FILTER_GAINHF_AUTO = 0x2000C;

	/** Auxiliary effect slot properties. */
	public static final int
		AL_EFFECTSLOT_NULL                = 0x0,
		AL_EFFECTSLOT_EFFECT              = 0x1,
		AL_EFFECTSLOT_GAIN                = 0x2,
		AL_EFFECTSLOT_AUXILIARY_SEND_AUTO = 0x3;

	/** Reverb effect parameters. */
	public static final int
		AL_REVERB_DENSITY               = 0x1,
		AL_REVERB_DIFFUSION             = 0x2,
		AL_REVERB_GAIN                  = 0x3,
		AL_REVERB_GAINHF                = 0x4,
		AL_REVERB_DECAY_TIME            = 0x5,
		AL_REVERB_DECAY_HFRATIO         = 0x6,
		AL_REVERB_REFLECTIONS_GAIN      = 0x7,
		AL_REVERB_REFLECTIONS_DELAY     = 0x8,
		AL_REVERB_LATE_REVERB_GAIN      = 0x9,
		AL_REVERB_LATE_REVERB_DELAY     = 0xA,
		AL_REVERB_AIR_ABSORPTION_GAINHF = 0xB,
		AL_REVERB_ROOM_ROLLOFF_FACTOR   = 0xC,
		AL_REVERB_DECAY_HFLIMIT         = 0xD;

	/** EAX Reverb effect parameters. */
	public static final int
		AL_EAXREVERB_DENSITY               = 0x1,
		AL_EAXREVERB_DIFFUSION             = 0x2,
		AL_EAXREVERB_GAIN                  = 0x3,
		AL_EAXREVERB_GAINHF                = 0x4,
		AL_EAXREVERB_GAINLF                = 0x5,
		AL_EAXREVERB_DECAY_TIME            = 0x6,
		AL_EAXREVERB_DECAY_HFRATIO         = 0x7,
		AL_EAXREVERB_DECAY_LFRATIO         = 0x8,
		AL_EAXREVERB_REFLECTIONS_GAIN      = 0x9,
		AL_EAXREVERB_REFLECTIONS_DELAY     = 0xA,
		AL_EAXREVERB_REFLECTIONS_PAN       = 0xB,
		AL_EAXREVERB_LATE_REVERB_GAIN      = 0xC,
		AL_EAXREVERB_LATE_REVERB_DELAY     = 0xD,
		AL_EAXREVERB_LATE_REVERB_PAN       = 0xE,
		AL_EAXREVERB_ECHO_TIME             = 0xF,
		AL_EAXREVERB_ECHO_DEPTH            = 0x10,
		AL_EAXREVERB_MODULATION_TIME       = 0x11,
		AL_EAXREVERB_MODULATION_DEPTH      = 0x12,
		AL_EAXREVERB_AIR_ABSORPTION_GAINHF = 0x13,
		AL_EAXREVERB_HFREFERENCE           = 0x14,
		AL_EAXREVERB_LFREFERENCE           = 0x15,
		AL_EAXREVERB_ROOM_ROLLOFF_FACTOR   = 0x16,
		AL_EAXREVERB_DECAY_HFLIMIT         = 0x17;

	/** Chorus effect parameters. */
	public static final int
		AL_CHORUS_WAVEFORM = 0x1,
		AL_CHORUS_PHASE    = 0x2,
		AL_CHORUS_RATE     = 0x3,
		AL_CHORUS_DEPTH    = 0x4,
		AL_CHORUS_FEEDBACK = 0x5,
		AL_CHORUS_DELAY    = 0x6;

	/** Distortion effect parameters. */
	public static final int
		AL_DISTORTION_EDGE           = 0x1,
		AL_DISTORTION_GAIN           = 0x2,
		AL_DISTORTION_LOWPASS_CUTOFF = 0x3,
		AL_DISTORTION_EQCENTER       = 0x4,
		AL_DISTORTION_EQBANDWIDTH    = 0x5;

	/** Echo effect parameters. */
	public static final int
		AL_ECHO_DELAY    = 0x1,
		AL_ECHO_LRDELAY  = 0x2,
		AL_ECHO_DAMPING  = 0x3,
		AL_ECHO_FEEDBACK = 0x4,
		AL_ECHO_SPREAD   = 0x5;

	/** Flanger effect parameters. */
	public static final int
		AL_FLANGER_WAVEFORM = 0x1,
		AL_FLANGER_PHASE    = 0x2,
		AL_FLANGER_RATE     = 0x3,
		AL_FLANGER_DEPTH    = 0x4,
		AL_FLANGER_FEEDBACK = 0x5,
		AL_FLANGER_DELAY    = 0x6;

	/** Frequency shifter effect parameters. */
	public static final int
		AL_FREQUENCY_SHIFTER_FREQUENCY       = 0x1,
		AL_FREQUENCY_SHIFTER_LEFT_DIRECTION  = 0x2,
		AL_FREQUENCY_SHIFTER_RIGHT_DIRECTION = 0x3;

	/** Vocal morpher effect parameters. */
	public static final int
		AL_VOCMORPHER_PHONEMEA               = 0x1,
		AL_VOCMORPHER_PHONEMEA_COARSE_TUNING = 0x2,
		AL_VOCMORPHER_PHONEMEB               = 0x3,
		AL_VOCMORPHER_PHONEMEB_COARSE_TUNING = 0x4,
		AL_VOCMORPHER_WAVEFORM               = 0x5,
		AL_VOCMORPHER_RATE                   = 0x6;

	/** Pitch shifter effect parameters. */
	public static final int
		AL_PITCH_SHIFTER_COARSE_TUNE = 0x1,
		AL_PITCH_SHIFTER_FINE_TUNE   = 0x2;

	/** Ring modulator effect parameters. */
	public static final int
		AL_RING_MODULATOR_FREQUENCY       = 0x1,
		AL_RING_MODULATOR_HIGHPASS_CUTOFF = 0x2,
		AL_RING_MODULATOR_WAVEFORM        = 0x3;

	/** Autowah effect parameters. */
	public static final int
		AL_AUTOWAH_ATTACK_TIME  = 0x1,
		AL_AUTOWAH_RELEASE_TIME = 0x2,
		AL_AUTOWAH_RESONANCE    = 0x3,
		AL_AUTOWAH_PEAK_GAIN    = 0x4;

	/** Compressor effect parameters. */
	public static final int AL_COMPRESSOR_ONOFF = 0x1;

	/** Equalizer effect parameters. */
	public static final int
		AL_EQUALIZER_LOW_GAIN    = 0x1,
		AL_EQUALIZER_LOW_CUTOFF  = 0x2,
		AL_EQUALIZER_MID1_GAIN   = 0x3,
		AL_EQUALIZER_MID1_CENTER = 0x4,
		AL_EQUALIZER_MID1_WIDTH  = 0x5,
		AL_EQUALIZER_MID2_GAIN   = 0x6,
		AL_EQUALIZER_MID2_CENTER = 0x7,
		AL_EQUALIZER_MID2_WIDTH  = 0x8,
		AL_EQUALIZER_HIGH_GAIN   = 0x9,
		AL_EQUALIZER_HIGH_CUTOFF = 0xA;

	/** Effect type effect parameters. */
	public static final int
		AL_EFFECT_FIRST_PARAMETER = 0x0,
		AL_EFFECT_LAST_PARAMETER  = 0x8000,
		AL_EFFECT_TYPE            = 0x8001;

	/** Effect types */
	public static final int
		AL_EFFECT_NULL              = 0x0,
		AL_EFFECT_REVERB            = 0x1,
		AL_EFFECT_CHORUS            = 0x2,
		AL_EFFECT_DISTORTION        = 0x3,
		AL_EFFECT_ECHO              = 0x4,
		AL_EFFECT_FLANGER           = 0x5,
		AL_EFFECT_FREQUENCY_SHIFTER = 0x6,
		AL_EFFECT_VOCAL_MORPHER     = 0x7,
		AL_EFFECT_PITCH_SHIFTER     = 0x8,
		AL_EFFECT_RING_MODULATOR    = 0x9,
		AL_EFFECT_AUTOWAH           = 0xA,
		AL_EFFECT_COMPRESSOR        = 0xB,
		AL_EFFECT_EQUALIZER         = 0xC,
		AL_EFFECT_EAXREVERB         = 0x8000;

	/** Lowpass filter properties */
	public static final int
		AL_LOWPASS_GAIN   = 0x1,
		AL_LOWPASS_GAINHF = 0x2;

	/** Highpass filter properties */
	public static final int
		AL_HIGHPASS_GAIN   = 0x1,
		AL_HIGHPASS_GAINLF = 0x2;

	/** Bandpass filter properties */
	public static final int
		AL_BANDPASS_GAIN   = 0x1,
		AL_BANDPASS_GAINLF = 0x2,
		AL_BANDPASS_GAINHF = 0x3;

	/** Filter type */
	public static final int
		AL_FILTER_FIRST_PARAMETER = 0x0,
		AL_FILTER_LAST_PARAMETER  = 0x8000,
		AL_FILTER_TYPE            = 0x8001;

	/** Filter types. */
	public static final int
		AL_FILTER_NULL     = 0x0,
		AL_FILTER_LOWPASS  = 0x1,
		AL_FILTER_HIGHPASS = 0x2,
		AL_FILTER_BANDPASS = 0x3;

	/** Source property value ranges and defaults */
	public static final float
		AL_MIN_AIR_ABSORPTION_FACTOR     = 0.0f,
		AL_MAX_AIR_ABSORPTION_FACTOR     = 10.0f,
		AL_DEFAULT_AIR_ABSORPTION_FACTOR = 0.0f,
		AL_MIN_ROOM_ROLLOFF_FACTOR       = 0.0f,
		AL_MAX_ROOM_ROLLOFF_FACTOR       = 10.0f,
		AL_DEFAULT_ROOM_ROLLOFF_FACTOR   = 0.0f,
		AL_MIN_CONE_OUTER_GAINHF         = 0.0f,
		AL_MAX_CONE_OUTER_GAINHF         = 1.0f,
		AL_DEFAULT_CONE_OUTER_GAINHF     = 1.0f;

	/** Source property value ranges and defaults */
	public static final int
		AL_MIN_DIRECT_FILTER_GAINHF_AUTO             = 0x0,
		AL_MAX_DIRECT_FILTER_GAINHF_AUTO             = 0x1,
		AL_DEFAULT_DIRECT_FILTER_GAINHF_AUTO         = 0x1,
		AL_MIN_AUXILIARY_SEND_FILTER_GAIN_AUTO       = 0x0,
		AL_MAX_AUXILIARY_SEND_FILTER_GAIN_AUTO       = 0x1,
		AL_DEFAULT_AUXILIARY_SEND_FILTER_GAIN_AUTO   = 0x1,
		AL_MIN_AUXILIARY_SEND_FILTER_GAINHF_AUTO     = 0x0,
		AL_MAX_AUXILIARY_SEND_FILTER_GAINHF_AUTO     = 0x1,
		AL_DEFAULT_AUXILIARY_SEND_FILTER_GAINHF_AUTO = 0x1;

	/** Listener property value ranges and defaults. */
	public static final float
		AL_MIN_METERS_PER_UNIT     = 0x0.000002P-126f,
		AL_MAX_METERS_PER_UNIT     = 0x1.fffffeP+127f,
		AL_DEFAULT_METERS_PER_UNIT = 1.0f;

	/** Reverb effect parameter ranges and defaults */
	public static final float
		AL_REVERB_MIN_DENSITY                   = 0.0f,
		AL_REVERB_MAX_DENSITY                   = 1.0f,
		AL_REVERB_DEFAULT_DENSITY               = 1.0f,
		AL_REVERB_MIN_DIFFUSION                 = 0.0f,
		AL_REVERB_MAX_DIFFUSION                 = 1.0f,
		AL_REVERB_DEFAULT_DIFFUSION             = 1.0f,
		AL_REVERB_MIN_GAIN                      = 0.0f,
		AL_REVERB_MAX_GAIN                      = 1.0f,
		AL_REVERB_DEFAULT_GAIN                  = 0.32f,
		AL_REVERB_MIN_GAINHF                    = 0.0f,
		AL_REVERB_MAX_GAINHF                    = 1.0f,
		AL_REVERB_DEFAULT_GAINHF                = 0.89f,
		AL_REVERB_MIN_DECAY_TIME                = 0.1f,
		AL_REVERB_MAX_DECAY_TIME                = 20.0f,
		AL_REVERB_DEFAULT_DECAY_TIME            = 1.49f,
		AL_REVERB_MIN_DECAY_HFRATIO             = 0.1f,
		AL_REVERB_MAX_DECAY_HFRATIO             = 2.0f,
		AL_REVERB_DEFAULT_DECAY_HFRATIO         = 0.83f,
		AL_REVERB_MIN_REFLECTIONS_GAIN          = 0.0f,
		AL_REVERB_MAX_REFLECTIONS_GAIN          = 3.16f,
		AL_REVERB_DEFAULT_REFLECTIONS_GAIN      = 0.05f,
		AL_REVERB_MIN_REFLECTIONS_DELAY         = 0.0f,
		AL_REVERB_MAX_REFLECTIONS_DELAY         = 0.3f,
		AL_REVERB_DEFAULT_REFLECTIONS_DELAY     = 0.007f,
		AL_REVERB_MIN_LATE_REVERB_GAIN          = 0.0f,
		AL_REVERB_MAX_LATE_REVERB_GAIN          = 10.0f,
		AL_REVERB_DEFAULT_LATE_REVERB_GAIN      = 1.26f,
		AL_REVERB_MIN_LATE_REVERB_DELAY         = 0.0f,
		AL_REVERB_MAX_LATE_REVERB_DELAY         = 0.1f,
		AL_REVERB_DEFAULT_LATE_REVERB_DELAY     = 0.011f,
		AL_REVERB_MIN_AIR_ABSORPTION_GAINHF     = 0.892f,
		AL_REVERB_MAX_AIR_ABSORPTION_GAINHF     = 1.0f,
		AL_REVERB_DEFAULT_AIR_ABSORPTION_GAINHF = 0.994f,
		AL_REVERB_MIN_ROOM_ROLLOFF_FACTOR       = 0.0f,
		AL_REVERB_MAX_ROOM_ROLLOFF_FACTOR       = 10.0f,
		AL_REVERB_DEFAULT_ROOM_ROLLOFF_FACTOR   = 0.0f;

	/** Reverb effect parameter ranges and defaults */
	public static final int
		AL_REVERB_MIN_DECAY_HFLIMIT     = 0x0,
		AL_REVERB_MAX_DECAY_HFLIMIT     = 0x1,
		AL_REVERB_DEFAULT_DECAY_HFLIMIT = 0x1;

	/** EAX reverb effect parameter ranges and defaults */
	public static final float
		AL_EAXREVERB_MIN_DENSITY                   = 0.0f,
		AL_EAXREVERB_MAX_DENSITY                   = 1.0f,
		AL_EAXREVERB_DEFAULT_DENSITY               = 1.0f,
		AL_EAXREVERB_MIN_DIFFUSION                 = 0.0f,
		AL_EAXREVERB_MAX_DIFFUSION                 = 1.0f,
		AL_EAXREVERB_DEFAULT_DIFFUSION             = 1.0f,
		AL_EAXREVERB_MIN_GAIN                      = 0.0f,
		AL_EAXREVERB_MAX_GAIN                      = 1.0f,
		AL_EAXREVERB_DEFAULT_GAIN                  = 0.32f,
		AL_EAXREVERB_MIN_GAINHF                    = 0.0f,
		AL_EAXREVERB_MAX_GAINHF                    = 1.0f,
		AL_EAXREVERB_DEFAULT_GAINHF                = 0.89f,
		AL_EAXREVERB_MIN_GAINLF                    = 0.0f,
		AL_EAXREVERB_MAX_GAINLF                    = 1.0f,
		AL_EAXREVERB_DEFAULT_GAINLF                = 1.0f,
		AL_EAXREVERB_MIN_DECAY_TIME                = 0.1f,
		AL_EAXREVERB_MAX_DECAY_TIME                = 20.0f,
		AL_EAXREVERB_DEFAULT_DECAY_TIME            = 1.49f,
		AL_EAXREVERB_MIN_DECAY_HFRATIO             = 0.1f,
		AL_EAXREVERB_MAX_DECAY_HFRATIO             = 2.0f,
		AL_EAXREVERB_DEFAULT_DECAY_HFRATIO         = 0.83f,
		AL_EAXREVERB_MIN_DECAY_LFRATIO             = 0.1f,
		AL_EAXREVERB_MAX_DECAY_LFRATIO             = 2.0f,
		AL_EAXREVERB_DEFAULT_DECAY_LFRATIO         = 1.0f,
		AL_EAXREVERB_MIN_REFLECTIONS_GAIN          = 0.0f,
		AL_EAXREVERB_MAX_REFLECTIONS_GAIN          = 3.16f,
		AL_EAXREVERB_DEFAULT_REFLECTIONS_GAIN      = 0.05f,
		AL_EAXREVERB_MIN_REFLECTIONS_DELAY         = 0.0f,
		AL_EAXREVERB_MAX_REFLECTIONS_DELAY         = 0.3f,
		AL_EAXREVERB_DEFAULT_REFLECTIONS_DELAY     = 0.007f,
		AL_EAXREVERB_DEFAULT_REFLECTIONS_PAN_XYZ   = 0.0f,
		AL_EAXREVERB_MIN_LATE_REVERB_GAIN          = 0.0f,
		AL_EAXREVERB_MAX_LATE_REVERB_GAIN          = 10.0f,
		AL_EAXREVERB_DEFAULT_LATE_REVERB_GAIN      = 1.26f,
		AL_EAXREVERB_MIN_LATE_REVERB_DELAY         = 0.0f,
		AL_EAXREVERB_MAX_LATE_REVERB_DELAY         = 0.1f,
		AL_EAXREVERB_DEFAULT_LATE_REVERB_DELAY     = 0.011f,
		AL_EAXREVERB_DEFAULT_LATE_REVERB_PAN_XYZ   = 0.0f,
		AL_EAXREVERB_MIN_ECHO_TIME                 = 0.075f,
		AL_EAXREVERB_MAX_ECHO_TIME                 = 0.25f,
		AL_EAXREVERB_DEFAULT_ECHO_TIME             = 0.25f,
		AL_EAXREVERB_MIN_ECHO_DEPTH                = 0.0f,
		AL_EAXREVERB_MAX_ECHO_DEPTH                = 1.0f,
		AL_EAXREVERB_DEFAULT_ECHO_DEPTH            = 0.0f,
		AL_EAXREVERB_MIN_MODULATION_TIME           = 0.04f,
		AL_EAXREVERB_MAX_MODULATION_TIME           = 4.0f,
		AL_EAXREVERB_DEFAULT_MODULATION_TIME       = 0.25f,
		AL_EAXREVERB_MIN_MODULATION_DEPTH          = 0.0f,
		AL_EAXREVERB_MAX_MODULATION_DEPTH          = 1.0f,
		AL_EAXREVERB_DEFAULT_MODULATION_DEPTH      = 0.0f,
		AL_EAXREVERB_MIN_AIR_ABSORPTION_GAINHF     = 0.892f,
		AL_EAXREVERB_MAX_AIR_ABSORPTION_GAINHF     = 1.0f,
		AL_EAXREVERB_DEFAULT_AIR_ABSORPTION_GAINHF = 0.994f,
		AL_EAXREVERB_MIN_HFREFERENCE               = 1000.0f,
		AL_EAXREVERB_MAX_HFREFERENCE               = 20000.0f,
		AL_EAXREVERB_DEFAULT_HFREFERENCE           = 5000.0f,
		AL_EAXREVERB_MIN_LFREFERENCE               = 20.0f,
		AL_EAXREVERB_MAX_LFREFERENCE               = 1000.0f,
		AL_EAXREVERB_DEFAULT_LFREFERENCE           = 250.0f,
		AL_EAXREVERB_MIN_ROOM_ROLLOFF_FACTOR       = 0.0f,
		AL_EAXREVERB_MAX_ROOM_ROLLOFF_FACTOR       = 10.0f,
		AL_EAXREVERB_DEFAULT_ROOM_ROLLOFF_FACTOR   = 0.0f;

	/** EAX reverb effect parameter ranges and defaults */
	public static final int
		AL_EAXREVERB_MIN_DECAY_HFLIMIT     = 0x0,
		AL_EAXREVERB_MAX_DECAY_HFLIMIT     = 0x1,
		AL_EAXREVERB_DEFAULT_DECAY_HFLIMIT = 0x1;

	/** Chorus effect parameter ranges and defaults */
	public static final int
		AL_CHORUS_WAVEFORM_SINUSOID = 0x0,
		AL_CHORUS_WAVEFORM_TRIANGLE = 0x1,
		AL_CHORUS_MIN_WAVEFORM      = 0x0,
		AL_CHORUS_MAX_WAVEFORM      = 0x1,
		AL_CHORUS_DEFAULT_WAVEFORM  = 0x1,
		AL_CHORUS_MIN_PHASE         = 0xFFFFFF4C,
		AL_CHORUS_MAX_PHASE         = 0xB4,
		AL_CHORUS_DEFAULT_PHASE     = 0x5A;

	/** Chorus effect parameter ranges and defaults */
	public static final float
		AL_CHORUS_MIN_RATE         = 0.0f,
		AL_CHORUS_MAX_RATE         = 10.0f,
		AL_CHORUS_DEFAULT_RATE     = 1.1f,
		AL_CHORUS_MIN_DEPTH        = 0.0f,
		AL_CHORUS_MAX_DEPTH        = 1.0f,
		AL_CHORUS_DEFAULT_DEPTH    = 0.1f,
		AL_CHORUS_MIN_FEEDBACK     = -1.0f,
		AL_CHORUS_MAX_FEEDBACK     = 1.0f,
		AL_CHORUS_DEFAULT_FEEDBACK = 0.25f,
		AL_CHORUS_MIN_DELAY        = 0.0f,
		AL_CHORUS_MAX_DELAY        = 0.016f,
		AL_CHORUS_DEFAULT_DELAY    = 0.016f;

	/** Distortion effect parameter ranges and defaults */
	public static final float
		AL_DISTORTION_MIN_EDGE               = 0.0f,
		AL_DISTORTION_MAX_EDGE               = 1.0f,
		AL_DISTORTION_DEFAULT_EDGE           = 0.2f,
		AL_DISTORTION_MIN_GAIN               = 0.01f,
		AL_DISTORTION_MAX_GAIN               = 1.0f,
		AL_DISTORTION_DEFAULT_GAIN           = 0.05f,
		AL_DISTORTION_MIN_LOWPASS_CUTOFF     = 80.0f,
		AL_DISTORTION_MAX_LOWPASS_CUTOFF     = 24000.0f,
		AL_DISTORTION_DEFAULT_LOWPASS_CUTOFF = 8000.0f,
		AL_DISTORTION_MIN_EQCENTER           = 80.0f,
		AL_DISTORTION_MAX_EQCENTER           = 24000.0f,
		AL_DISTORTION_DEFAULT_EQCENTER       = 3600.0f,
		AL_DISTORTION_MIN_EQBANDWIDTH        = 80.0f,
		AL_DISTORTION_MAX_EQBANDWIDTH        = 24000.0f,
		AL_DISTORTION_DEFAULT_EQBANDWIDTH    = 3600.0f;

	/** Echo effect parameter ranges and defaults */
	public static final float
		AL_ECHO_MIN_DELAY        = 0.0f,
		AL_ECHO_MAX_DELAY        = 0.207f,
		AL_ECHO_DEFAULT_DELAY    = 0.1f,
		AL_ECHO_MIN_LRDELAY      = 0.0f,
		AL_ECHO_MAX_LRDELAY      = 0.404f,
		AL_ECHO_DEFAULT_LRDELAY  = 0.1f,
		AL_ECHO_MIN_DAMPING      = 0.0f,
		AL_ECHO_MAX_DAMPING      = 0.99f,
		AL_ECHO_DEFAULT_DAMPING  = 0.5f,
		AL_ECHO_MIN_FEEDBACK     = 0.0f,
		AL_ECHO_MAX_FEEDBACK     = 1.0f,
		AL_ECHO_DEFAULT_FEEDBACK = 0.5f,
		AL_ECHO_MIN_SPREAD       = -1.0f,
		AL_ECHO_MAX_SPREAD       = 1.0f,
		AL_ECHO_DEFAULT_SPREAD   = -1.0f;

	/** Flanger effect parameter ranges and defaults */
	public static final int
		AL_FLANGER_WAVEFORM_SINUSOID = 0x0,
		AL_FLANGER_WAVEFORM_TRIANGLE = 0x1,
		AL_FLANGER_MIN_WAVEFORM      = 0x0,
		AL_FLANGER_MAX_WAVEFORM      = 0x1,
		AL_FLANGER_DEFAULT_WAVEFORM  = 0x1,
		AL_FLANGER_MIN_PHASE         = 0xFFFFFF4C,
		AL_FLANGER_MAX_PHASE         = 0xB4,
		AL_FLANGER_DEFAULT_PHASE     = 0x0;

	/** Flanger effect parameter ranges and defaults */
	public static final float
		AL_FLANGER_MIN_RATE         = 0.0f,
		AL_FLANGER_MAX_RATE         = 10.0f,
		AL_FLANGER_DEFAULT_RATE     = 0.27f,
		AL_FLANGER_MIN_DEPTH        = 0.0f,
		AL_FLANGER_MAX_DEPTH        = 1.0f,
		AL_FLANGER_DEFAULT_DEPTH    = 1.0f,
		AL_FLANGER_MIN_FEEDBACK     = -1.0f,
		AL_FLANGER_MAX_FEEDBACK     = 1.0f,
		AL_FLANGER_DEFAULT_FEEDBACK = -0.5f,
		AL_FLANGER_MIN_DELAY        = 0.0f,
		AL_FLANGER_MAX_DELAY        = 0.004f,
		AL_FLANGER_DEFAULT_DELAY    = 0.002f;

	/** Frequency shifter effect parameter ranges and defaults */
	public static final float
		AL_FREQUENCY_SHIFTER_MIN_FREQUENCY     = 0.0f,
		AL_FREQUENCY_SHIFTER_MAX_FREQUENCY     = 24000.0f,
		AL_FREQUENCY_SHIFTER_DEFAULT_FREQUENCY = 0.0f;

	/** Frequency shifter effect parameter ranges and defaults */
	public static final int
		AL_FREQUENCY_SHIFTER_MIN_LEFT_DIRECTION      = 0x0,
		AL_FREQUENCY_SHIFTER_MAX_LEFT_DIRECTION      = 0x2,
		AL_FREQUENCY_SHIFTER_DEFAULT_LEFT_DIRECTION  = 0x0,
		AL_FREQUENCY_SHIFTER_DIRECTION_DOWN          = 0x0,
		AL_FREQUENCY_SHIFTER_DIRECTION_UP            = 0x1,
		AL_FREQUENCY_SHIFTER_DIRECTION_OFF           = 0x2,
		AL_FREQUENCY_SHIFTER_MIN_RIGHT_DIRECTION     = 0x0,
		AL_FREQUENCY_SHIFTER_MAX_RIGHT_DIRECTION     = 0x2,
		AL_FREQUENCY_SHIFTER_DEFAULT_RIGHT_DIRECTION = 0x0;

	/** Vocal morpher effect parameter ranges and defaults */
	public static final int
		AL_VOCAL_MORPHER_MIN_PHONEMEA                   = 0x0,
		AL_VOCAL_MORPHER_MAX_PHONEMEA                   = 0x1D,
		AL_VOCAL_MORPHER_DEFAULT_PHONEMEA               = 0x0,
		AL_VOCAL_MORPHER_MIN_PHONEMEA_COARSE_TUNING     = 0xFFFFFFE8,
		AL_VOCAL_MORPHER_MAX_PHONEMEA_COARSE_TUNING     = 0x18,
		AL_VOCAL_MORPHER_DEFAULT_PHONEMEA_COARSE_TUNING = 0x0,
		AL_VOCAL_MORPHER_MIN_PHONEMEB                   = 0x0,
		AL_VOCAL_MORPHER_MAX_PHONEMEB                   = 0x1D,
		AL_VOCAL_MORPHER_DEFAULT_PHONEMEB               = 0xA,
		AL_VOCAL_MORPHER_MIN_PHONEMEB_COARSE_TUNING     = 0xFFFFFFE8,
		AL_VOCAL_MORPHER_MAX_PHONEMEB_COARSE_TUNING     = 0x18,
		AL_VOCAL_MORPHER_DEFAULT_PHONEMEB_COARSE_TUNING = 0x0,
		AL_VOCAL_MORPHER_PHONEME_A                      = 0x0,
		AL_VOCAL_MORPHER_PHONEME_E                      = 0x1,
		AL_VOCAL_MORPHER_PHONEME_I                      = 0x2,
		AL_VOCAL_MORPHER_PHONEME_O                      = 0x3,
		AL_VOCAL_MORPHER_PHONEME_U                      = 0x4,
		AL_VOCAL_MORPHER_PHONEME_AA                     = 0x5,
		AL_VOCAL_MORPHER_PHONEME_AE                     = 0x6,
		AL_VOCAL_MORPHER_PHONEME_AH                     = 0x7,
		AL_VOCAL_MORPHER_PHONEME_AO                     = 0x8,
		AL_VOCAL_MORPHER_PHONEME_EH                     = 0x9,
		AL_VOCAL_MORPHER_PHONEME_ER                     = 0xA,
		AL_VOCAL_MORPHER_PHONEME_IH                     = 0xB,
		AL_VOCAL_MORPHER_PHONEME_IY                     = 0xC,
		AL_VOCAL_MORPHER_PHONEME_UH                     = 0xD,
		AL_VOCAL_MORPHER_PHONEME_UW                     = 0xE,
		AL_VOCAL_MORPHER_PHONEME_B                      = 0xF,
		AL_VOCAL_MORPHER_PHONEME_D                      = 0x10,
		AL_VOCAL_MORPHER_PHONEME_F                      = 0x11,
		AL_VOCAL_MORPHER_PHONEME_G                      = 0x12,
		AL_VOCAL_MORPHER_PHONEME_J                      = 0x13,
		AL_VOCAL_MORPHER_PHONEME_K                      = 0x14,
		AL_VOCAL_MORPHER_PHONEME_L                      = 0x15,
		AL_VOCAL_MORPHER_PHONEME_M                      = 0x16,
		AL_VOCAL_MORPHER_PHONEME_N                      = 0x17,
		AL_VOCAL_MORPHER_PHONEME_P                      = 0x18,
		AL_VOCAL_MORPHER_PHONEME_R                      = 0x19,
		AL_VOCAL_MORPHER_PHONEME_S                      = 0x1A,
		AL_VOCAL_MORPHER_PHONEME_T                      = 0x1B,
		AL_VOCAL_MORPHER_PHONEME_V                      = 0x1C,
		AL_VOCAL_MORPHER_PHONEME_Z                      = 0x1D,
		AL_VOCAL_MORPHER_WAVEFORM_SINUSOID              = 0x0,
		AL_VOCAL_MORPHER_WAVEFORM_TRIANGLE              = 0x1,
		AL_VOCAL_MORPHER_WAVEFORM_SAWTOOTH              = 0x2,
		AL_VOCAL_MORPHER_MIN_WAVEFORM                   = 0x0,
		AL_VOCAL_MORPHER_MAX_WAVEFORM                   = 0x2,
		AL_VOCAL_MORPHER_DEFAULT_WAVEFORM               = 0x0;

	/** Vocal morpher effect parameter ranges and defaults */
	public static final float
		AL_VOCAL_MORPHER_MIN_RATE     = 0.0f,
		AL_VOCAL_MORPHER_MAX_RATE     = 10.0f,
		AL_VOCAL_MORPHER_DEFAULT_RATE = 1.41f;

	/** Pitch shifter effect parameter ranges and defaults */
	public static final int
		AL_PITCH_SHIFTER_MIN_COARSE_TUNE     = 0xFFFFFFF4,
		AL_PITCH_SHIFTER_MAX_COARSE_TUNE     = 0xC,
		AL_PITCH_SHIFTER_DEFAULT_COARSE_TUNE = 0xC,
		AL_PITCH_SHIFTER_MIN_FINE_TUNE       = 0xFFFFFFCE,
		AL_PITCH_SHIFTER_MAX_FINE_TUNE       = 0x32,
		AL_PITCH_SHIFTER_DEFAULT_FINE_TUNE   = 0x0;

	/** Ring modulator effect parameter ranges and defaults */
	public static final float
		AL_RING_MODULATOR_MIN_FREQUENCY           = 0.0f,
		AL_RING_MODULATOR_MAX_FREQUENCY           = 8000.0f,
		AL_RING_MODULATOR_DEFAULT_FREQUENCY       = 440.0f,
		AL_RING_MODULATOR_MIN_HIGHPASS_CUTOFF     = 0.0f,
		AL_RING_MODULATOR_MAX_HIGHPASS_CUTOFF     = 24000.0f,
		AL_RING_MODULATOR_DEFAULT_HIGHPASS_CUTOFF = 800.0f;

	/** Ring modulator effect parameter ranges and defaults */
	public static final int
		AL_RING_MODULATOR_SINUSOID         = 0x0,
		AL_RING_MODULATOR_SAWTOOTH         = 0x1,
		AL_RING_MODULATOR_SQUARE           = 0x2,
		AL_RING_MODULATOR_MIN_WAVEFORM     = 0x0,
		AL_RING_MODULATOR_MAX_WAVEFORM     = 0x2,
		AL_RING_MODULATOR_DEFAULT_WAVEFORM = 0x0;

	/** Autowah effect parameter ranges and defaults */
	public static final float
		AL_AUTOWAH_MIN_ATTACK_TIME      = 1.0E-4f,
		AL_AUTOWAH_MAX_ATTACK_TIME      = 1.0f,
		AL_AUTOWAH_DEFAULT_ATTACK_TIME  = 0.06f,
		AL_AUTOWAH_MIN_RELEASE_TIME     = 1.0E-4f,
		AL_AUTOWAH_MAX_RELEASE_TIME     = 1.0f,
		AL_AUTOWAH_DEFAULT_RELEASE_TIME = 0.06f,
		AL_AUTOWAH_MIN_RESONANCE        = 2.0f,
		AL_AUTOWAH_MAX_RESONANCE        = 1000.0f,
		AL_AUTOWAH_DEFAULT_RESONANCE    = 1000.0f,
		AL_AUTOWAH_MIN_PEAK_GAIN        = 3.0E-5f,
		AL_AUTOWAH_MAX_PEAK_GAIN        = 31621.0f,
		AL_AUTOWAH_DEFAULT_PEAK_GAIN    = 11.22f;

	/** Compressor effect parameter ranges and defaults */
	public static final int
		AL_COMPRESSOR_MIN_ONOFF     = 0x0,
		AL_COMPRESSOR_MAX_ONOFF     = 0x1,
		AL_COMPRESSOR_DEFAULT_ONOFF = 0x1;

	/** Equalizer effect parameter ranges and defaults */
	public static final float
		AL_EQUALIZER_MIN_LOW_GAIN        = 0.126f,
		AL_EQUALIZER_MAX_LOW_GAIN        = 7.943f,
		AL_EQUALIZER_DEFAULT_LOW_GAIN    = 1.0f,
		AL_EQUALIZER_MIN_LOW_CUTOFF      = 50.0f,
		AL_EQUALIZER_MAX_LOW_CUTOFF      = 800.0f,
		AL_EQUALIZER_DEFAULT_LOW_CUTOFF  = 200.0f,
		AL_EQUALIZER_MIN_MID1_GAIN       = 0.126f,
		AL_EQUALIZER_MAX_MID1_GAIN       = 7.943f,
		AL_EQUALIZER_DEFAULT_MID1_GAIN   = 1.0f,
		AL_EQUALIZER_MIN_MID1_CENTER     = 200.0f,
		AL_EQUALIZER_MAX_MID1_CENTER     = 3000.0f,
		AL_EQUALIZER_DEFAULT_MID1_CENTER = 500.0f,
		AL_EQUALIZER_MIN_MID1_WIDTH      = 0.01f,
		AL_EQUALIZER_MAX_MID1_WIDTH      = 1.0f,
		AL_EQUALIZER_DEFAULT_MID1_WIDTH  = 1.0f,
		AL_EQUALIZER_MIN_MID2_GAIN       = 0.126f,
		AL_EQUALIZER_MAX_MID2_GAIN       = 7.943f,
		AL_EQUALIZER_DEFAULT_MID2_GAIN   = 1.0f,
		AL_EQUALIZER_MIN_MID2_CENTER     = 1000.0f,
		AL_EQUALIZER_MAX_MID2_CENTER     = 8000.0f,
		AL_EQUALIZER_DEFAULT_MID2_CENTER = 3000.0f,
		AL_EQUALIZER_MIN_MID2_WIDTH      = 0.01f,
		AL_EQUALIZER_MAX_MID2_WIDTH      = 1.0f,
		AL_EQUALIZER_DEFAULT_MID2_WIDTH  = 1.0f,
		AL_EQUALIZER_MIN_HIGH_GAIN       = 0.126f,
		AL_EQUALIZER_MAX_HIGH_GAIN       = 7.943f,
		AL_EQUALIZER_DEFAULT_HIGH_GAIN   = 1.0f,
		AL_EQUALIZER_MIN_HIGH_CUTOFF     = 4000.0f,
		AL_EQUALIZER_MAX_HIGH_CUTOFF     = 16000.0f,
		AL_EQUALIZER_DEFAULT_HIGH_CUTOFF = 6000.0f;

	/** Lowpass filter parameter ranges and defaults */
	public static final float
		AL_LOWPASS_MIN_GAIN       = 0.0f,
		AL_LOWPASS_MAX_GAIN       = 1.0f,
		AL_LOWPASS_DEFAULT_GAIN   = 1.0f,
		AL_LOWPASS_MIN_GAINHF     = 0.0f,
		AL_LOWPASS_MAX_GAINHF     = 1.0f,
		AL_LOWPASS_DEFAULT_GAINHF = 1.0f;

	/** Highpass filter parameter ranges and defaults */
	public static final float
		AL_HIGHPASS_MIN_GAIN       = 0.0f,
		AL_HIGHPASS_MAX_GAIN       = 1.0f,
		AL_HIGHPASS_DEFAULT_GAIN   = 1.0f,
		AL_HIGHPASS_MIN_GAINLF     = 0.0f,
		AL_HIGHPASS_MAX_GAINLF     = 1.0f,
		AL_HIGHPASS_DEFAULT_GAINLF = 1.0f;

	/** Bandpass filter parameter ranges and defaults */
	public static final float
		AL_BANDPASS_MIN_GAIN       = 0.0f,
		AL_BANDPASS_MAX_GAIN       = 1.0f,
		AL_BANDPASS_DEFAULT_GAIN   = 1.0f,
		AL_BANDPASS_MIN_GAINHF     = 0.0f,
		AL_BANDPASS_MAX_GAINHF     = 1.0f,
		AL_BANDPASS_DEFAULT_GAINHF = 1.0f,
		AL_BANDPASS_MIN_GAINLF     = 0.0f,
		AL_BANDPASS_MAX_GAINLF     = 1.0f,
		AL_BANDPASS_DEFAULT_GAINLF = 1.0f;

	protected EXTEfx() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(ALCapabilities caps) {
		return checkFunctions(
			caps.alGenEffects, caps.alDeleteEffects, caps.alIsEffect, caps.alEffecti, caps.alEffectiv, caps.alEffectf, caps.alEffectfv, caps.alGetEffecti, 
			caps.alGetEffectiv, caps.alGetEffectf, caps.alGetEffectfv, caps.alGenFilters, caps.alDeleteFilters, caps.alIsFilter, caps.alFilteri, 
			caps.alFilteriv, caps.alFilterf, caps.alFilterfv, caps.alGetFilteri, caps.alGetFilteriv, caps.alGetFilterf, caps.alGetFilterfv, 
			caps.alGenAuxiliaryEffectSlots, caps.alDeleteAuxiliaryEffectSlots, caps.alIsAuxiliaryEffectSlot, caps.alAuxiliaryEffectSloti, 
			caps.alAuxiliaryEffectSlotiv, caps.alAuxiliaryEffectSlotf, caps.alAuxiliaryEffectSlotfv, caps.alGetAuxiliaryEffectSloti, 
			caps.alGetAuxiliaryEffectSlotiv, caps.alGetAuxiliaryEffectSlotf, caps.alGetAuxiliaryEffectSlotfv
		);
	}

	// --- [ alGenEffects ] ---

	/** Unsafe version of {@link #alGenEffects GenEffects} */
	public static void nalGenEffects(int n, long effects) {
		long __functionAddress = AL.getCapabilities().alGenEffects;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIPV(__functionAddress, n, effects);
	}

	/**
	 * Requests a number of effects.
	 *
	 * @param n       the number of effects be to generated
	 * @param effects the buffer that will receive the effects
	 */
	public static void alGenEffects(int n, ByteBuffer effects) {
		if ( CHECKS )
			checkBuffer(effects, n << 2);
		nalGenEffects(n, memAddress(effects));
	}

	/** Alternative version of: {@link #alGenEffects GenEffects} */
	public static void alGenEffects(IntBuffer effects) {
		nalGenEffects(effects.remaining(), memAddress(effects));
	}

	/** Single return value version of: {@link #alGenEffects GenEffects} */
	public static int alGenEffects() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer effects = stack.callocInt(1);
			nalGenEffects(1, memAddress(effects));
			return effects.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alDeleteEffects ] ---

	/** Unsafe version of {@link #alDeleteEffects DeleteEffects} */
	public static void nalDeleteEffects(int n, long effects) {
		long __functionAddress = AL.getCapabilities().alDeleteEffects;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIPV(__functionAddress, n, effects);
	}

	/**
	 * Deletes a number of effects.
	 *
	 * @param n       the number of effects be to deleted
	 * @param effects the effect to delete
	 */
	public static void alDeleteEffects(int n, ByteBuffer effects) {
		if ( CHECKS )
			checkBuffer(effects, n << 2);
		nalDeleteEffects(n, memAddress(effects));
	}

	/** Alternative version of: {@link #alDeleteEffects DeleteEffects} */
	public static void alDeleteEffects(IntBuffer effects) {
		nalDeleteEffects(effects.remaining(), memAddress(effects));
	}

	/** Single value version of: {@link #alDeleteEffects DeleteEffects} */
	public static void alDeleteEffects(int effect) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer effects = stack.ints(effect);
			nalDeleteEffects(1, memAddress(effects));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alIsEffect ] ---

	/**
	 * Verifies whether the given object name is an effect.
	 *
	 * @param effect a value that may be a effect name
	 */
	public static boolean alIsEffect(int effect) {
		long __functionAddress = AL.getCapabilities().alIsEffect;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return invokeIZ(__functionAddress, effect);
	}

	// --- [ alEffecti ] ---

	/**
	 * Sets the integer value of an effect parameter.
	 *
	 * @param effect the effect to modify
	 * @param param  the parameter to modify
	 * @param value  the parameter value
	 */
	public static void alEffecti(int effect, int param, int value) {
		long __functionAddress = AL.getCapabilities().alEffecti;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIIV(__functionAddress, effect, param, value);
	}

	// --- [ alEffectiv ] ---

	/** Unsafe version of {@link #alEffectiv Effectiv} */
	public static void nalEffectiv(int effect, int param, long values) {
		long __functionAddress = AL.getCapabilities().alEffectiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIPV(__functionAddress, effect, param, values);
	}

	/**
	 * Pointer version of {@link #alEffecti Effecti}.
	 *
	 * @param effect the effect to modify
	 * @param param  the parameter to modify
	 * @param values the parameter values
	 */
	public static void alEffectiv(int effect, int param, ByteBuffer values) {
		nalEffectiv(effect, param, memAddress(values));
	}

	/** Alternative version of: {@link #alEffectiv Effectiv} */
	public static void alEffectiv(int effect, int param, IntBuffer values) {
		nalEffectiv(effect, param, memAddress(values));
	}

	// --- [ alEffectf ] ---

	/**
	 * Sets the float value of an effect parameter.
	 *
	 * @param effect the effect to modify
	 * @param param  the parameter to modify
	 * @param value  the parameter value
	 */
	public static void alEffectf(int effect, int param, float value) {
		long __functionAddress = AL.getCapabilities().alEffectf;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIFV(__functionAddress, effect, param, value);
	}

	// --- [ alEffectfv ] ---

	/** Unsafe version of {@link #alEffectfv Effectfv} */
	public static void nalEffectfv(int effect, int param, long values) {
		long __functionAddress = AL.getCapabilities().alEffectfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIPV(__functionAddress, effect, param, values);
	}

	/**
	 * Pointer version of {@link #alEffectf Effectf}.
	 *
	 * @param effect the effect to modify
	 * @param param  the parameter to modify
	 * @param values the parameter values
	 */
	public static void alEffectfv(int effect, int param, ByteBuffer values) {
		nalEffectfv(effect, param, memAddress(values));
	}

	/** Alternative version of: {@link #alEffectfv Effectfv} */
	public static void alEffectfv(int effect, int param, FloatBuffer values) {
		nalEffectfv(effect, param, memAddress(values));
	}

	// --- [ alGetEffecti ] ---

	/** Unsafe version of {@link #alGetEffecti GetEffecti} */
	public static void nalGetEffecti(int effect, int param, long value) {
		long __functionAddress = AL.getCapabilities().alGetEffecti;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIPV(__functionAddress, effect, param, value);
	}

	/**
	 * Returns the integer value of the specified effect parameter.
	 *
	 * @param effect the effect to query
	 * @param param  the parameter to query
	 * @param value  the parameter value
	 */
	public static void alGetEffecti(int effect, int param, ByteBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1 << 2);
		nalGetEffecti(effect, param, memAddress(value));
	}

	/** Alternative version of: {@link #alGetEffecti GetEffecti} */
	public static void alGetEffecti(int effect, int param, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nalGetEffecti(effect, param, memAddress(value));
	}

	/** Single return value version of: {@link #alGetEffecti GetEffecti} */
	public static int alGetEffecti(int effect, int param) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer value = stack.callocInt(1);
			nalGetEffecti(effect, param, memAddress(value));
			return value.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alGetEffectiv ] ---

	/** Unsafe version of {@link #alGetEffectiv GetEffectiv} */
	public static void nalGetEffectiv(int effect, int param, long values) {
		long __functionAddress = AL.getCapabilities().alGetEffectiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIPV(__functionAddress, effect, param, values);
	}

	/**
	 * Returns the integer values of the specified effect parameter.
	 *
	 * @param effect the effect to query
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetEffectiv(int effect, int param, ByteBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1 << 2);
		nalGetEffectiv(effect, param, memAddress(values));
	}

	/** Alternative version of: {@link #alGetEffectiv GetEffectiv} */
	public static void alGetEffectiv(int effect, int param, IntBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1);
		nalGetEffectiv(effect, param, memAddress(values));
	}

	// --- [ alGetEffectf ] ---

	/** Unsafe version of {@link #alGetEffectf GetEffectf} */
	public static void nalGetEffectf(int effect, int param, long value) {
		long __functionAddress = AL.getCapabilities().alGetEffectf;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIPV(__functionAddress, effect, param, value);
	}

	/**
	 * Returns the float value of the specified effect parameter.
	 *
	 * @param effect the effect to query
	 * @param param  the parameter to query
	 * @param value  the parameter value
	 */
	public static void alGetEffectf(int effect, int param, ByteBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1 << 2);
		nalGetEffectf(effect, param, memAddress(value));
	}

	/** Alternative version of: {@link #alGetEffectf GetEffectf} */
	public static void alGetEffectf(int effect, int param, FloatBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nalGetEffectf(effect, param, memAddress(value));
	}

	/** Single return value version of: {@link #alGetEffectf GetEffectf} */
	public static float alGetEffectf(int effect, int param) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer value = stack.callocFloat(1);
			nalGetEffectf(effect, param, memAddress(value));
			return value.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alGetEffectfv ] ---

	/** Unsafe version of {@link #alGetEffectfv GetEffectfv} */
	public static void nalGetEffectfv(int effect, int param, long values) {
		long __functionAddress = AL.getCapabilities().alGetEffectfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIPV(__functionAddress, effect, param, values);
	}

	/**
	 * Returns the float values of the specified effect parameter.
	 *
	 * @param effect the effect to query
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetEffectfv(int effect, int param, ByteBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1 << 2);
		nalGetEffectfv(effect, param, memAddress(values));
	}

	/** Alternative version of: {@link #alGetEffectfv GetEffectfv} */
	public static void alGetEffectfv(int effect, int param, FloatBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1);
		nalGetEffectfv(effect, param, memAddress(values));
	}

	// --- [ alGenFilters ] ---

	/** Unsafe version of {@link #alGenFilters GenFilters} */
	public static void nalGenFilters(int n, long filters) {
		long __functionAddress = AL.getCapabilities().alGenFilters;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIPV(__functionAddress, n, filters);
	}

	/**
	 * Requests a number of filters.
	 *
	 * @param n       the number of filters be to generated
	 * @param filters the buffer that will receive the filters
	 */
	public static void alGenFilters(int n, ByteBuffer filters) {
		if ( CHECKS )
			checkBuffer(filters, n << 2);
		nalGenFilters(n, memAddress(filters));
	}

	/** Alternative version of: {@link #alGenFilters GenFilters} */
	public static void alGenFilters(IntBuffer filters) {
		nalGenFilters(filters.remaining(), memAddress(filters));
	}

	/** Single return value version of: {@link #alGenFilters GenFilters} */
	public static int alGenFilters() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer filters = stack.callocInt(1);
			nalGenFilters(1, memAddress(filters));
			return filters.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alDeleteFilters ] ---

	/** Unsafe version of {@link #alDeleteFilters DeleteFilters} */
	public static void nalDeleteFilters(int n, long filters) {
		long __functionAddress = AL.getCapabilities().alDeleteFilters;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIPV(__functionAddress, n, filters);
	}

	/**
	 * Deletes a number of filters.
	 *
	 * @param n       the number of filters be to deleted
	 * @param filters the filter to delete
	 */
	public static void alDeleteFilters(int n, ByteBuffer filters) {
		if ( CHECKS )
			checkBuffer(filters, n << 2);
		nalDeleteFilters(n, memAddress(filters));
	}

	/** Alternative version of: {@link #alDeleteFilters DeleteFilters} */
	public static void alDeleteFilters(IntBuffer filters) {
		nalDeleteFilters(filters.remaining(), memAddress(filters));
	}

	/** Single value version of: {@link #alDeleteFilters DeleteFilters} */
	public static void alDeleteFilters(int filter) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer filters = stack.ints(filter);
			nalDeleteFilters(1, memAddress(filters));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alIsFilter ] ---

	/**
	 * Verifies whether the given object name is a filter.
	 *
	 * @param filter a value that may be a filter name
	 */
	public static boolean alIsFilter(int filter) {
		long __functionAddress = AL.getCapabilities().alIsFilter;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return invokeIZ(__functionAddress, filter);
	}

	// --- [ alFilteri ] ---

	/**
	 * Sets the integer value of a filter parameter.
	 *
	 * @param filter the filter to modify
	 * @param param  the parameter to modify
	 * @param value  the parameter value
	 */
	public static void alFilteri(int filter, int param, int value) {
		long __functionAddress = AL.getCapabilities().alFilteri;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIIV(__functionAddress, filter, param, value);
	}

	// --- [ alFilteriv ] ---

	/** Unsafe version of {@link #alFilteriv Filteriv} */
	public static void nalFilteriv(int filter, int param, long values) {
		long __functionAddress = AL.getCapabilities().alFilteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIPV(__functionAddress, filter, param, values);
	}

	/**
	 * Pointer version of {@link #alFilteri Filteri}.
	 *
	 * @param filter the filter to modify
	 * @param param  the parameter to modify
	 * @param values the parameter values
	 */
	public static void alFilteriv(int filter, int param, ByteBuffer values) {
		nalFilteriv(filter, param, memAddress(values));
	}

	/** Alternative version of: {@link #alFilteriv Filteriv} */
	public static void alFilteriv(int filter, int param, IntBuffer values) {
		nalFilteriv(filter, param, memAddress(values));
	}

	// --- [ alFilterf ] ---

	/**
	 * Sets the float value of a filter parameter.
	 *
	 * @param filter the filter to modify
	 * @param param  the parameter to modify
	 * @param value  the parameter value
	 */
	public static void alFilterf(int filter, int param, float value) {
		long __functionAddress = AL.getCapabilities().alFilterf;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIFV(__functionAddress, filter, param, value);
	}

	// --- [ alFilterfv ] ---

	/** Unsafe version of {@link #alFilterfv Filterfv} */
	public static void nalFilterfv(int filter, int param, long values) {
		long __functionAddress = AL.getCapabilities().alFilterfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIPV(__functionAddress, filter, param, values);
	}

	/**
	 * Pointer version of {@link #alFilterf Filterf}.
	 *
	 * @param filter the filter to modify
	 * @param param  the parameter to modify
	 * @param values the parameter values
	 */
	public static void alFilterfv(int filter, int param, ByteBuffer values) {
		nalFilterfv(filter, param, memAddress(values));
	}

	/** Alternative version of: {@link #alFilterfv Filterfv} */
	public static void alFilterfv(int filter, int param, FloatBuffer values) {
		nalFilterfv(filter, param, memAddress(values));
	}

	// --- [ alGetFilteri ] ---

	/** Unsafe version of {@link #alGetFilteri GetFilteri} */
	public static void nalGetFilteri(int filter, int param, long value) {
		long __functionAddress = AL.getCapabilities().alGetFilteri;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIPV(__functionAddress, filter, param, value);
	}

	/**
	 * Returns the integer value of the specified filter parameter.
	 *
	 * @param filter the filter to query
	 * @param param  the parameter to query
	 * @param value  the parameter value
	 */
	public static void alGetFilteri(int filter, int param, ByteBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1 << 2);
		nalGetFilteri(filter, param, memAddress(value));
	}

	/** Alternative version of: {@link #alGetFilteri GetFilteri} */
	public static void alGetFilteri(int filter, int param, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nalGetFilteri(filter, param, memAddress(value));
	}

	/** Single return value version of: {@link #alGetFilteri GetFilteri} */
	public static int alGetFilteri(int filter, int param) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer value = stack.callocInt(1);
			nalGetFilteri(filter, param, memAddress(value));
			return value.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alGetFilteriv ] ---

	/** Unsafe version of {@link #alGetFilteriv GetFilteriv} */
	public static void nalGetFilteriv(int filter, int param, long values) {
		long __functionAddress = AL.getCapabilities().alGetFilteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIPV(__functionAddress, filter, param, values);
	}

	/**
	 * Returns the integer values of the specified filter parameter.
	 *
	 * @param filter the filter to query
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetFilteriv(int filter, int param, ByteBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1 << 2);
		nalGetFilteriv(filter, param, memAddress(values));
	}

	/** Alternative version of: {@link #alGetFilteriv GetFilteriv} */
	public static void alGetFilteriv(int filter, int param, IntBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1);
		nalGetFilteriv(filter, param, memAddress(values));
	}

	// --- [ alGetFilterf ] ---

	/** Unsafe version of {@link #alGetFilterf GetFilterf} */
	public static void nalGetFilterf(int filter, int param, long value) {
		long __functionAddress = AL.getCapabilities().alGetFilterf;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIPV(__functionAddress, filter, param, value);
	}

	/**
	 * Returns the float value of the specified filter parameter.
	 *
	 * @param filter the effect to query
	 * @param param  the parameter to query
	 * @param value  the parameter value
	 */
	public static void alGetFilterf(int filter, int param, ByteBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1 << 2);
		nalGetFilterf(filter, param, memAddress(value));
	}

	/** Alternative version of: {@link #alGetFilterf GetFilterf} */
	public static void alGetFilterf(int filter, int param, FloatBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nalGetFilterf(filter, param, memAddress(value));
	}

	/** Single return value version of: {@link #alGetFilterf GetFilterf} */
	public static float alGetFilterf(int filter, int param) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer value = stack.callocFloat(1);
			nalGetFilterf(filter, param, memAddress(value));
			return value.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alGetFilterfv ] ---

	/** Unsafe version of {@link #alGetFilterfv GetFilterfv} */
	public static void nalGetFilterfv(int filter, int param, long values) {
		long __functionAddress = AL.getCapabilities().alGetFilterfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIPV(__functionAddress, filter, param, values);
	}

	/**
	 * Returns the float values of the specified filter parameter.
	 *
	 * @param filter the effect to query
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetFilterfv(int filter, int param, ByteBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1 << 2);
		nalGetFilterfv(filter, param, memAddress(values));
	}

	/** Alternative version of: {@link #alGetFilterfv GetFilterfv} */
	public static void alGetFilterfv(int filter, int param, FloatBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1);
		nalGetFilterfv(filter, param, memAddress(values));
	}

	// --- [ alGenAuxiliaryEffectSlots ] ---

	/** Unsafe version of {@link #alGenAuxiliaryEffectSlots GenAuxiliaryEffectSlots} */
	public static void nalGenAuxiliaryEffectSlots(int n, long effectSlots) {
		long __functionAddress = AL.getCapabilities().alGenAuxiliaryEffectSlots;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIPV(__functionAddress, n, effectSlots);
	}

	/**
	 * Requests a number of effect slots.
	 *
	 * @param n           the number of effect slots be to generated
	 * @param effectSlots the buffer that will receive the effect slots
	 */
	public static void alGenAuxiliaryEffectSlots(int n, ByteBuffer effectSlots) {
		if ( CHECKS )
			checkBuffer(effectSlots, n << 2);
		nalGenAuxiliaryEffectSlots(n, memAddress(effectSlots));
	}

	/** Alternative version of: {@link #alGenAuxiliaryEffectSlots GenAuxiliaryEffectSlots} */
	public static void alGenAuxiliaryEffectSlots(IntBuffer effectSlots) {
		nalGenAuxiliaryEffectSlots(effectSlots.remaining(), memAddress(effectSlots));
	}

	/** Single return value version of: {@link #alGenAuxiliaryEffectSlots GenAuxiliaryEffectSlots} */
	public static int alGenAuxiliaryEffectSlots() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer effectSlots = stack.callocInt(1);
			nalGenAuxiliaryEffectSlots(1, memAddress(effectSlots));
			return effectSlots.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alDeleteAuxiliaryEffectSlots ] ---

	/** Unsafe version of {@link #alDeleteAuxiliaryEffectSlots DeleteAuxiliaryEffectSlots} */
	public static void nalDeleteAuxiliaryEffectSlots(int n, long effectSlots) {
		long __functionAddress = AL.getCapabilities().alDeleteAuxiliaryEffectSlots;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIPV(__functionAddress, n, effectSlots);
	}

	/**
	 * Deletes a number of effect slots.
	 *
	 * @param n           the number of effect slots be to deleted
	 * @param effectSlots the effectSlot to delete
	 */
	public static void alDeleteAuxiliaryEffectSlots(int n, ByteBuffer effectSlots) {
		if ( CHECKS )
			checkBuffer(effectSlots, n << 2);
		nalDeleteAuxiliaryEffectSlots(n, memAddress(effectSlots));
	}

	/** Alternative version of: {@link #alDeleteAuxiliaryEffectSlots DeleteAuxiliaryEffectSlots} */
	public static void alDeleteAuxiliaryEffectSlots(IntBuffer effectSlots) {
		nalDeleteAuxiliaryEffectSlots(effectSlots.remaining(), memAddress(effectSlots));
	}

	/** Single value version of: {@link #alDeleteAuxiliaryEffectSlots DeleteAuxiliaryEffectSlots} */
	public static void alDeleteAuxiliaryEffectSlots(int effectSlot) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer effectSlots = stack.ints(effectSlot);
			nalDeleteAuxiliaryEffectSlots(1, memAddress(effectSlots));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alIsAuxiliaryEffectSlot ] ---

	/**
	 * Verifies whether the given object name is an effect slot.
	 *
	 * @param effectSlot a value that may be an effect slot name
	 */
	public static boolean alIsAuxiliaryEffectSlot(int effectSlot) {
		long __functionAddress = AL.getCapabilities().alIsAuxiliaryEffectSlot;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return invokeIZ(__functionAddress, effectSlot);
	}

	// --- [ alAuxiliaryEffectSloti ] ---

	/**
	 * Sets the integer value of an effect slot parameter.
	 *
	 * @param effectSlot the effect slot to modify
	 * @param param      the parameter to modify
	 * @param value      the parameter value
	 */
	public static void alAuxiliaryEffectSloti(int effectSlot, int param, int value) {
		long __functionAddress = AL.getCapabilities().alAuxiliaryEffectSloti;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIIV(__functionAddress, effectSlot, param, value);
	}

	// --- [ alAuxiliaryEffectSlotiv ] ---

	/** Unsafe version of {@link #alAuxiliaryEffectSlotiv AuxiliaryEffectSlotiv} */
	public static void nalAuxiliaryEffectSlotiv(int effectSlot, int param, long values) {
		long __functionAddress = AL.getCapabilities().alAuxiliaryEffectSlotiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIPV(__functionAddress, effectSlot, param, values);
	}

	/**
	 * Pointer version of {@link #alAuxiliaryEffectSloti AuxiliaryEffectSloti}.
	 *
	 * @param effectSlot the effect slot to modify
	 * @param param      the parameter to modify
	 * @param values     the parameter values
	 */
	public static void alAuxiliaryEffectSlotiv(int effectSlot, int param, ByteBuffer values) {
		nalAuxiliaryEffectSlotiv(effectSlot, param, memAddress(values));
	}

	/** Alternative version of: {@link #alAuxiliaryEffectSlotiv AuxiliaryEffectSlotiv} */
	public static void alAuxiliaryEffectSlotiv(int effectSlot, int param, IntBuffer values) {
		nalAuxiliaryEffectSlotiv(effectSlot, param, memAddress(values));
	}

	// --- [ alAuxiliaryEffectSlotf ] ---

	/**
	 * Sets the float value of an effect slot parameter.
	 *
	 * @param effectSlot the effect slot to modify
	 * @param param      the parameter to modify
	 * @param value      the parameter value
	 */
	public static void alAuxiliaryEffectSlotf(int effectSlot, int param, float value) {
		long __functionAddress = AL.getCapabilities().alAuxiliaryEffectSlotf;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIFV(__functionAddress, effectSlot, param, value);
	}

	// --- [ alAuxiliaryEffectSlotfv ] ---

	/** Unsafe version of {@link #alAuxiliaryEffectSlotfv AuxiliaryEffectSlotfv} */
	public static void nalAuxiliaryEffectSlotfv(int effectSlot, int param, long values) {
		long __functionAddress = AL.getCapabilities().alAuxiliaryEffectSlotfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIPV(__functionAddress, effectSlot, param, values);
	}

	/**
	 * Pointer version of {@link #alAuxiliaryEffectSlotf AuxiliaryEffectSlotf}.
	 *
	 * @param effectSlot the effect slot to modify
	 * @param param      the parameter to modify
	 * @param values     the parameter values
	 */
	public static void alAuxiliaryEffectSlotfv(int effectSlot, int param, ByteBuffer values) {
		nalAuxiliaryEffectSlotfv(effectSlot, param, memAddress(values));
	}

	/** Alternative version of: {@link #alAuxiliaryEffectSlotfv AuxiliaryEffectSlotfv} */
	public static void alAuxiliaryEffectSlotfv(int effectSlot, int param, FloatBuffer values) {
		nalAuxiliaryEffectSlotfv(effectSlot, param, memAddress(values));
	}

	// --- [ alGetAuxiliaryEffectSloti ] ---

	/** Unsafe version of {@link #alGetAuxiliaryEffectSloti GetAuxiliaryEffectSloti} */
	public static void nalGetAuxiliaryEffectSloti(int effectSlot, int param, long value) {
		long __functionAddress = AL.getCapabilities().alGetAuxiliaryEffectSloti;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIPV(__functionAddress, effectSlot, param, value);
	}

	/**
	 * Returns the integer value of the specified effect slot parameter.
	 *
	 * @param effectSlot the effect slot to query
	 * @param param      the parameter to query
	 * @param value      the parameter value
	 */
	public static void alGetAuxiliaryEffectSloti(int effectSlot, int param, ByteBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1 << 2);
		nalGetAuxiliaryEffectSloti(effectSlot, param, memAddress(value));
	}

	/** Alternative version of: {@link #alGetAuxiliaryEffectSloti GetAuxiliaryEffectSloti} */
	public static void alGetAuxiliaryEffectSloti(int effectSlot, int param, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nalGetAuxiliaryEffectSloti(effectSlot, param, memAddress(value));
	}

	/** Single return value version of: {@link #alGetAuxiliaryEffectSloti GetAuxiliaryEffectSloti} */
	public static int alGetAuxiliaryEffectSloti(int effectSlot, int param) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer value = stack.callocInt(1);
			nalGetAuxiliaryEffectSloti(effectSlot, param, memAddress(value));
			return value.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alGetAuxiliaryEffectSlotiv ] ---

	/** Unsafe version of {@link #alGetAuxiliaryEffectSlotiv GetAuxiliaryEffectSlotiv} */
	public static void nalGetAuxiliaryEffectSlotiv(int effectSlot, int param, long values) {
		long __functionAddress = AL.getCapabilities().alGetAuxiliaryEffectSlotiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIPV(__functionAddress, effectSlot, param, values);
	}

	/**
	 * Returns the integer values of the specified effect slot parameter.
	 *
	 * @param effectSlot the effect slot to query
	 * @param param      the parameter to query
	 * @param values     the parameter values
	 */
	public static void alGetAuxiliaryEffectSlotiv(int effectSlot, int param, ByteBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1 << 2);
		nalGetAuxiliaryEffectSlotiv(effectSlot, param, memAddress(values));
	}

	/** Alternative version of: {@link #alGetAuxiliaryEffectSlotiv GetAuxiliaryEffectSlotiv} */
	public static void alGetAuxiliaryEffectSlotiv(int effectSlot, int param, IntBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1);
		nalGetAuxiliaryEffectSlotiv(effectSlot, param, memAddress(values));
	}

	// --- [ alGetAuxiliaryEffectSlotf ] ---

	/** Unsafe version of {@link #alGetAuxiliaryEffectSlotf GetAuxiliaryEffectSlotf} */
	public static void nalGetAuxiliaryEffectSlotf(int effectSlot, int param, long value) {
		long __functionAddress = AL.getCapabilities().alGetAuxiliaryEffectSlotf;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIPV(__functionAddress, effectSlot, param, value);
	}

	/**
	 * Returns the float value of the specified filter parameter.
	 *
	 * @param effectSlot the effect slot to query
	 * @param param      the parameter to query
	 * @param value      the parameter value
	 */
	public static void alGetAuxiliaryEffectSlotf(int effectSlot, int param, ByteBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1 << 2);
		nalGetAuxiliaryEffectSlotf(effectSlot, param, memAddress(value));
	}

	/** Alternative version of: {@link #alGetAuxiliaryEffectSlotf GetAuxiliaryEffectSlotf} */
	public static void alGetAuxiliaryEffectSlotf(int effectSlot, int param, FloatBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nalGetAuxiliaryEffectSlotf(effectSlot, param, memAddress(value));
	}

	/** Single return value version of: {@link #alGetAuxiliaryEffectSlotf GetAuxiliaryEffectSlotf} */
	public static float alGetAuxiliaryEffectSlotf(int effectSlot, int param) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer value = stack.callocFloat(1);
			nalGetAuxiliaryEffectSlotf(effectSlot, param, memAddress(value));
			return value.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ alGetAuxiliaryEffectSlotfv ] ---

	/** Unsafe version of {@link #alGetAuxiliaryEffectSlotfv GetAuxiliaryEffectSlotfv} */
	public static void nalGetAuxiliaryEffectSlotfv(int effectSlot, int param, long values) {
		long __functionAddress = AL.getCapabilities().alGetAuxiliaryEffectSlotfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIPV(__functionAddress, effectSlot, param, values);
	}

	/**
	 * Returns the float values of the specified effect slot parameter.
	 *
	 * @param effectSlot the effect to query
	 * @param param      the parameter to query
	 * @param values     the parameter values
	 */
	public static void alGetAuxiliaryEffectSlotfv(int effectSlot, int param, ByteBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1 << 2);
		nalGetAuxiliaryEffectSlotfv(effectSlot, param, memAddress(values));
	}

	/** Alternative version of: {@link #alGetAuxiliaryEffectSlotfv GetAuxiliaryEffectSlotfv} */
	public static void alGetAuxiliaryEffectSlotfv(int effectSlot, int param, FloatBuffer values) {
		if ( CHECKS )
			checkBuffer(values, 1);
		nalGetAuxiliaryEffectSlotfv(effectSlot, param, memAddress(values));
	}

}